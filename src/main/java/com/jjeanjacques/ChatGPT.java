package com.jjeanjacques;

import com.jjeanjacques.gateway.rest.ChatGptClient;
import com.jjeanjacques.gateway.rest.datacontract.ChatGptResponse;
import com.jjeanjacques.gateway.rest.datacontract.Choice;

/**
 * <p>
 * Java client for the ChatGPT
 * </p>
 *
 * @author <a href="https://github.com/jjeanjacques10">Jean Jacques Barros</a>
 * @since 2023/3/2
 */
public class ChatGPT {
    protected ChatGptClient client;

    public ChatGPT(String apiKey) {
        this.client = new ChatGptClient(apiKey);
    }

    public ChatGPT(ChatGptClient client) {
        this.client = client;
    }

    public String chat(String input) {
        ChatGptResponse chatResponse = this.client.chat(input);
        Choice choice = chatResponse.getChoices().stream().findFirst().get();
        return choice.getMessage().getContent();
    }

}
