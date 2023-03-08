package com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageResquest {
    private String role;
    private String content;
}
