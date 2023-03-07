package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.gateway.rest.ChatClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.jjeanjacques.chatgpt.fixture.chatGptResponseFixture.getChatGptResponse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChatGptTest {

    @Mock
    private ChatClient client;

    @Test
    public void chatTest() {
        ChatGpt chatGPT = new ChatGpt(client, null);

        when(client.chat("Hello, World!")).thenReturn(getChatGptResponse());

        ChatGptResponse response = chatGPT.chat("Hello, World!");
        Assert.assertEquals("123", response.getId());
        Assert.assertEquals("Hello!", response.getChoices().get(0).getMessage().getContent());
    }

    @Test
    public void chatMessageTest() {
        ChatGpt chatGPT = new ChatGpt(client, null);

        when(client.chat("Hello, World!")).thenReturn(getChatGptResponse());

        String response = chatGPT.chatMessage("Hello, World!");
        Assert.assertEquals(response, "Hello!");
    }
}
