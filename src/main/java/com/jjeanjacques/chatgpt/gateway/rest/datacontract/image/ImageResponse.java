package com.jjeanjacques.chatgpt.gateway.rest.datacontract.image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageResponse {
    private long created;
    private List<DataImage> data;
}
