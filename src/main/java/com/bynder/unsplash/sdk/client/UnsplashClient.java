package com.bynder.unsplash.sdk.client;

import com.bynder.unsplash.sdk.client.config.FeignConfig;
import com.bynder.unsplash.sdk.dto.PhotoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

    @FeignClient(value = "unsplash", url = "https://api.unsplash.com", configuration = {FeignConfig.class})
    public interface UnsplashClient {
        @RequestMapping(method = RequestMethod.GET, value = "/photos?client_id=cldjojM-4rJ5c8mvCvHv-PAQq_fltmJPJxYoAf2s-zk")
        List<PhotoResponse> getPhotos();
    }
