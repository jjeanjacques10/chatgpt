package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.enums.Model;
import com.jjeanjacques.chatgpt.gateway.rest.ChatClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.MessageResquest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.jjeanjacques.chatgpt.fixture.chatGptResponseFixture.getChatGptResponse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ChatGptTest {

    @Mock
    private ChatClient client;

    @InjectMocks
    private ChatGpt chatGpt;

    @Test
    public void chatTest() {
        ChatRequest request = ChatRequest.builder()
                .model(Model.GPT_3_5_TURBO.getValue())
                .messages(List.of(new MessageResquest("user", "Hello, World!"))).build();

        when(client.chat(request)).thenReturn(getChatGptResponse());

        ChatGptResponse response = this.chatGpt.chat("Hello, World!");
        Assert.assertEquals("123", response.getId());
        Assert.assertEquals("Hello!", response.getChoices().get(0).getMessage().getContent());
    }

    @Test
    public void chatMessageTest() {
        ChatRequest request = ChatRequest.builder()
                .model(Model.GPT_3_5_TURBO.getValue())
                .messages(List.of(new MessageResquest("user", "Hello, World!"))).build();

        when(client.chat(request)).thenReturn(getChatGptResponse());

        String response = this.chatGpt.chatMessage("Hello, World!");
        Assert.assertEquals(response, "Hello!");
    }
}
