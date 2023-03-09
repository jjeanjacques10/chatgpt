package com.jjeanjacques.chatgpt.gateway.rest.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjeanjacques.chatgpt.gateway.rest.ChatClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatRequest;
import com.jjeanjacques.chatgpt.utils.HttpUtil;
import lombok.AllArgsConstructor;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@AllArgsConstructor
public class ChatClientImpl implements ChatClient {

    private final HttpUtil httpUtil;
    private final String URL = "https://api.openai.com/v1/chat/completions";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ChatGptResponse chat(ChatRequest request) {
        try {
            Response response = this.httpUtil.post(URL, request);
            return objectMapper.readValue(response.body().string(), ChatGptResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
