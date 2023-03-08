package com.jjeanjacques.chatgpt.fixture;

import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Choice;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Message;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Usage;

import java.util.List;

public class chatGptResponseFixture {
    public static ChatGptResponse getChatGptResponse() {
        return ChatGptResponse.builder()
                .id("123")
                .model("")
                .usage(Usage.builder().promptTokens(1).completionTokens(1).totalTokens(1).build())
                .choices(List.of(new Choice(new Message("user", "Hello!"), "", 0)))
                .build();
    }
}
