package com.jjeanjacques.chatgpt.gateway.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjeanjacques.chatgpt.enums.Model;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.MessageResquest;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class ChatClient {
    private final String URL = "https://api.openai.com/v1/chat/completions";
    private final ObjectMapper objectMapper = new ObjectMapper();

    private String apiKey;

    public ChatClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public ChatGptResponse chat(String input) {
        OkHttpClient client = new OkHttpClient();

        ChatRequest requestBody = new ChatRequest(
                Model.GPT_3_5_TURBO.getValue(),
                List.of(new MessageResquest("user", input))
        );
        try {
            RequestBody body = RequestBody.create(objectMapper.writeValueAsString(requestBody), MediaType.get("application/json; charset=utf-8"));
            Request request = new Request.Builder()
                    .url(URL)
                    .header("Authorization", "Bearer " + this.apiKey)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
            return objectMapper.readValue(response.body().string(), ChatGptResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}