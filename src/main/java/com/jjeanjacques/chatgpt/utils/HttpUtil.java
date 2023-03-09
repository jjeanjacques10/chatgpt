package com.jjeanjacques.chatgpt.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HttpUtil {
    @Value("${chatgpt.apikey}")
    private String apiKey;
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final OkHttpClient client = new OkHttpClient();

    public Response post(String url, Object body) {
        try {
            RequestBody requestBody = RequestBody.create(objectMapper.writeValueAsString(body), MediaType.get("application/json; charset=utf-8"));
            Request request = new Request.Builder()
                    .url(url)
                    .header("Authorization", "Bearer " + this.apiKey)
                    .post(requestBody)
                    .build();

            return client.newCall(request).execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
