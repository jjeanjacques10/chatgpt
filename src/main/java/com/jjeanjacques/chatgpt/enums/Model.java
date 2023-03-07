package com.jjeanjacques.chatgpt.enums;

public enum Model {

    GPT_3_5_TURBO("gpt-3.5-turbo"),
    GPT_3_5_TURBO_0301("gpt-3.5-turbo-0301");

    private final String value;

    Model(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
