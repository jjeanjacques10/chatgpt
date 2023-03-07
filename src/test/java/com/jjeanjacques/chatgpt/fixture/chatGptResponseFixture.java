package com.jjeanjacques.chatgpt.fixture;

import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Choice;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Message;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Usage;

import java.util.List;

public class chatGptResponseFixture {
    public static ChatGptResponse getChatGptResponse() {
        return new ChatGptResponse(
                "123",
                "",
                10,
                "",
                new Usage(1, 1, 1),
                List.of(new Choice(new Message("user", "Hello!"), "", 0)));
    }
}
