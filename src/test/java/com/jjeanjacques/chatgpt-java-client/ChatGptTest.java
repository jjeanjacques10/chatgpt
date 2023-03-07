package com.jjeanjacques;

import com.jjeanjacques.gateway.rest.ChatGptClient;
import com.jjeanjacques.gateway.rest.datacontract.ChatGptResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.jjeanjacques.fixture.chatGptResponseFixture.getChatGptResponse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChatGptTest {

    @Mock
    private ChatGptClient client;

    @Test
    public void chatTest() {
        com.jjeanjacques.ChatGpt chatGPT = new com.jjeanjacques.ChatGpt(client);

        when(client.chat("Hello, World!")).thenReturn(getChatGptResponse());

        ChatGptResponse response = chatGPT.chat("Hello, World!");
        Assert.assertEquals("123", response.getId());
        Assert.assertEquals("Hello!", response.getChoices().get(0).getMessage().getContent());
    }

    @Test
    public void chatMessageTest() {
        com.jjeanjacques.ChatGpt chatGPT = new com.jjeanjacques.ChatGpt(client);

        when(client.chat("Hello, World!")).thenReturn(getChatGptResponse());

        String response = chatGPT.chatMessage("Hello, World!");
        Assert.assertEquals(response, "Hello!");
    }
}
