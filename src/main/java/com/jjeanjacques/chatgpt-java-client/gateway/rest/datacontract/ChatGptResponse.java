package com.jjeanjacques.gateway.rest.datacontract;

import java.util.List;

public class ChatGptResponse {
    private String id;
    private String object;
    private long created;
    private String model;
    private com.jjeanjacques.gateway.rest.datacontract.Usage usage;
    private List<com.jjeanjacques.gateway.rest.datacontract.Choice> choices;

    public ChatGptResponse() {
    }

    public ChatGptResponse(String id, String object, long created, String model, com.jjeanjacques.gateway.rest.datacontract.Usage usage, List<com.jjeanjacques.gateway.rest.datacontract.Choice> choices) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.model = model;
        this.usage = usage;
        this.choices = choices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public com.jjeanjacques.gateway.rest.datacontract.Usage getUsage() {
        return usage;
    }

    public void setUsage(com.jjeanjacques.gateway.rest.datacontract.Usage usage) {
        this.usage = usage;
    }

    public List<com.jjeanjacques.gateway.rest.datacontract.Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<com.jjeanjacques.gateway.rest.datacontract.Choice> choices) {
        this.choices = choices;
    }
}