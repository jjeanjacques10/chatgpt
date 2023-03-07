package com.jjeanjacques.chatgpt.gateway.rest.datacontract.image;

public class ImageRequest {
    private String prompt;
    private Integer n;
    private String size;

    public ImageRequest(String prompt, Integer n, String size) {
        this.prompt = prompt;
        this.n = n;
        this.size = size;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
