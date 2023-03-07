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
        ChatGPT chatGPT = new ChatGPT(client);

        when(client.chat("Hello, World!")).thenReturn(getChatGptResponse());

        String response = chatGPT.chat("Hello, World!");
        Assert.assertTrue(response.length() > 0);
        Assert.assertEquals(response, "Hello!");
    }
}
