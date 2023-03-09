package com.jjeanjacques.chatgpt.gateway.rest.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjeanjacques.chatgpt.gateway.rest.ImageClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageResponse;
import com.jjeanjacques.chatgpt.utils.HttpUtil;
import lombok.AllArgsConstructor;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@AllArgsConstructor
public class ImageClientImpl implements ImageClient {

    private final HttpUtil httpUtil;
    private final String URL = "https://api.openai.com/v1/images/generations";
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public ImageResponse getImage(ImageRequest request) {
        try {
            Response response = this.httpUtil.post(URL, request);
            return objectMapper.readValue(response.body().string(), ImageResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
