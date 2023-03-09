package com.jjeanjacques.chatgpt;

import com.jjeanjacques.chatgpt.gateway.rest.ImageClient;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.DataImage;
import com.jjeanjacques.chatgpt.gateway.rest.datacontract.image.ImageRequest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static com.jjeanjacques.chatgpt.fixture.ImageResponseFixture.getImageResponse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ImageGptTest {

    @Mock
    private ImageClient imageClient;

    @InjectMocks
    private ChatGpt chatGpt;

    @Test
    public void imageTest() {
        ImageRequest request = ImageRequest.builder()
                .prompt("A cute baby sea otter")
                .n(2)
                .size("1024x1024").build();

        when(imageClient.getImage(request)).thenReturn(getImageResponse());

        List<DataImage> response = this.chatGpt.image("A cute baby sea otter");
        Assert.assertEquals(1, response.size());
        Assert.assertEquals("https://image.test", response.get(0).getUrl());
    }

}
