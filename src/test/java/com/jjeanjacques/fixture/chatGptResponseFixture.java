package com.jjeanjacques.fixture;

import com.jjeanjacques.gateway.rest.datacontract.ChatGptResponse;
import com.jjeanjacques.gateway.rest.datacontract.Choice;
import com.jjeanjacques.gateway.rest.datacontract.Message;
import com.jjeanjacques.gateway.rest.datacontract.Usage;

import java.util.List;

public class chatGptResponseFixture {
    public static ChatGptResponse getChatGptResponse() {
        return new ChatGptResponse(
                "",
                "",
                10,
                "",
                new Usage(1, 1, 1),
                List.of(new Choice(new Message("user", "Hello!"), "", 0)));
    }
}
