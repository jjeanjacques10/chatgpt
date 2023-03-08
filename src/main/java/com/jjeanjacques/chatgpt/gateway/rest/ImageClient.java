package com.jjeanjacques.chatgpt.gateway.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageResponse;
import okhttp3.*;

import java.io.IOException;

public class ImageClient {
    private final String URL = "https://api.openai.com/v1/images/generations";
    private final String DEFAULT_IMAGE_SIZE = "1024x1024";
    private final ObjectMapper objectMapper = new ObjectMapper();

    private String apiKey;

    public ImageClient(String apiKey) {
        this.apiKey = apiKey;
    }

    public ImageResponse getImage(String input) {
        OkHttpClient client = new OkHttpClient();

        ImageRequest requestBody = ImageRequest.builder()
                .prompt(input)
                .n(2)
                .size(DEFAULT_IMAGE_SIZE).build();
        try {
            RequestBody body = RequestBody.create(objectMapper.writeValueAsString(requestBody), MediaType.get("application/json; charset=utf-8"));
            Request request = new Request.Builder()
                    .url(URL)
                    .header("Authorization", "Bearer " + this.apiKey)
                    .post(body)
                    .build();

            Response response = client.newCall(request).execute();
            return objectMapper.readValue(response.body().string(), ImageResponse.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}