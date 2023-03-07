package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.gateway.rest.ChatClient;
import com.jjeanjacques.chatgpt.gateway.rest.ImageClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Choice;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.DataImage;

import java.util.List;

/**
 * <p>
 * Java client for the ChatGPT
 * </p>
 *
 * @author <a href="https://github.com/jjeanjacques10">Jean Jacques Barros</a>
 * @since 2023/3/7
 */
public class ChatGpt {
    protected ChatClient client;
    protected ImageClient imageClient;

    public ChatGpt(String apiKey) {
        this.client = new ChatClient(apiKey);
        this.imageClient = new ImageClient(apiKey);
    }

    public ChatGpt(ChatClient client, ImageClient imageClient) {
        this.client = client;
        this.imageClient = imageClient;
    }

    public ChatGptResponse chat(String input) {
        ChatGptResponse chatResponse = this.client.chat(input);
        return chatResponse;
    }

    public String chatMessage(String input) {
        ChatGptResponse chatResponse = this.client.chat(input);
        Choice choice = chatResponse.getChoices().stream().findFirst().get();
        return choice.getMessage().getContent();
    }

    public List<DataImage> image(String input) {
        var imageResponse = this.imageClient.getImage(input);
        return imageResponse.getData();
    }

}
