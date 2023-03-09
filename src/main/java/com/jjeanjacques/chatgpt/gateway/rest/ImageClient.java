package com.jjeanjacques.chatgpt.gateway.rest;

import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageRequest;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageResponse;

public interface ImageClient {
    ImageResponse getImage(ImageRequest request);
}