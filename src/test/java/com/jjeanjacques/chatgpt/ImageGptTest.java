package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.gateway.rest.ImageClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.DataImage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.jjeanjacques.chatgpt.fixture.ImageResponseFixture.getImageResponse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ImageGptTest {

    @Mock
    private ImageClient imageClient;

    @Test
    public void imageTest() {
        ChatGpt chatGPT = new ChatGpt(null, imageClient);

        when(imageClient.getImage("A cute baby sea otter")).thenReturn(getImageResponse());

        List<DataImage> response = chatGPT.image("A cute baby sea otter");
        Assert.assertEquals(1, response.size());
        Assert.assertEquals("https://image.test", response.get(0).getUrl());
    }

}
