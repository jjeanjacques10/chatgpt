package com.jjeanjacques.chatgpt.gateway.rest.datacontract.image;

import java.util.List;

public class ImageResponse {
    private long created;
    private List<DataImage> data;

    public ImageResponse() {
    }

    public ImageResponse(long created, List<DataImage> data) {
        this.created = created;
        this.data = data;
    }

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public List<DataImage> getData() {
        return data;
    }

    public void setData(List<DataImage> data) {
        this.data = data;
    }
}
