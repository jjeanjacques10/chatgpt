package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.enums.Model;
import com.jjeanjacques.chatgpt.gateway.rest.ChatClient;
import com.jjeanjacques.chatgpt.gateway.rest.ImageClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.Choice;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.MessageResquest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.DataImage;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * Java client for the ChatGPT
 * </p>
 *
 * @author <a href="https://github.com/jjeanjacques10">Jean Jacques Barros</a>
 * @since 2023/3/7
 */
@Component
@AllArgsConstructor
public class ChatGpt {
    private final ChatClient client;
    private final ImageClient imageClient;
    private final String DEFAULT_IMAGE_SIZE = "1024x1024";

    public ChatGptResponse chat(String input) {
        ChatRequest requestBody = ChatRequest.builder()
                .model(Model.GPT_3_5_TURBO.getValue())
                .messages(List.of(new MessageResquest("user", input))).build();
        ChatGptResponse chatResponse = this.client.chat(requestBody);
        return chatResponse;
    }

    public String chatMessage(String input) {
        ChatRequest requestBody = ChatRequest.builder()
                .model(Model.GPT_3_5_TURBO.getValue())
                .messages(List.of(new MessageResquest("user", input))).build();
        ChatGptResponse chatResponse = this.client.chat(requestBody);
        Choice choice = chatResponse.getChoices().stream().findFirst().get();
        return choice.getMessage().getContent();
    }

    public List<DataImage> image(String input) {
        ImageRequest request = ImageRequest.builder()
                .prompt(input)
                .n(2)
                .size(DEFAULT_IMAGE_SIZE).build();
        ImageResponse imageResponse = this.imageClient.getImage(request);
        return imageResponse.getData();
    }

}
