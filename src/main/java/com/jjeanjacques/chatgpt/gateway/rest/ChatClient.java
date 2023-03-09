package com.jjeanjacques.chatgpt.gateway.rest;

import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatGptResponse;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.chat.ChatRequest;

public interface ChatClient {
    ChatGptResponse chat(ChatRequest chatRequest);
}
