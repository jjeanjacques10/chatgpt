package com.jjeanjacques.chatgpt.gateway.rest.datacontract.image;

public class DataImage {

    private String url;

    public DataImage() {
    }

    public DataImage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
