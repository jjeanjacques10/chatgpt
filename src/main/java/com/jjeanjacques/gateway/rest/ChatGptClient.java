package com.jjeanjacques.gateway.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjeanjacques.gateway.rest.datacontract.ChatGptResponse;
import com.jjeanjacques.gateway.rest.datacontract.ChatRequest;
import com.jjeanjacques.gateway.rest.datacontract.MessageResquest;
import okhttp3.*;

import java.io.IOException;
import java.util.List;

public class ChatGptClient {
    private final String URL = "https://api.openai.com/v1/chat/completions";
    private final String MODEL_GPT = "gpt-3.5-turbo";
    private final ObjectMapper objectMapper = new ObjectMapper();

    private String apiKey;

    public ChatGptClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public ChatGptResponse chat(String input) {
        OkHttpClient client = new OkHttpClient();

        ChatRequest requestBody = new ChatRequest(
                MODEL_GPT,
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
