package com.jjeanjacques.gateway.rest.datacontract;

import java.util.List;

public class ChatRequest {
    private String model;

    private List<MessageResquest> messages;

    public ChatRequest(String model, List<MessageResquest> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<MessageResquest> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageResquest> messages) {
        this.messages = messages;
    }
}
