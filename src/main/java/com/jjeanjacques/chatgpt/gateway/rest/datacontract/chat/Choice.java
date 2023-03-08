package com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Choice {
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;
    private int index;
}