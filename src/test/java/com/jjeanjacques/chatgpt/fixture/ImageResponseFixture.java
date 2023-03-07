package com.jjeanjacques.chatgpt.fixture;

import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.DataImage;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageResponse;

import java.util.List;

public class ImageResponseFixture {
    public static ImageResponse getImageResponse() {
        return new ImageResponse(123, List.of(new DataImage("https://image.test")));
    }
}
