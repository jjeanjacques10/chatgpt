package com.jjeanjacques.gateway.rest.datacontract;

import java.util.List;

public class ChatRequest {
    private String model;

    private List<com.jjeanjacques.gateway.rest.datacontract.MessageResquest> messages;

    public ChatRequest(String model, List<com.jjeanjacques.gateway.rest.datacontract.MessageResquest> messages) {
        this.model = model;
        this.messages = messages;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<com.jjeanjacques.gateway.rest.datacontract.MessageResquest> getMessages() {
        return messages;
    }

    public void setMessages(List<com.jjeanjacques.gateway.rest.datacontract.MessageResquest> messages) {
        this.messages = messages;
    }
}
