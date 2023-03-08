package com.jjeanjacques.chatgpt.gateway.rest.datacontract.image;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DataImage {
    private String url;
}
