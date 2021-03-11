package com.bynder.unsplash.sdk.client;

import com.bynder.unsplash.sdk.client.config.FeignConfig;
import com.bynder.unsplash.sdk.dto.CollectionResponse;
import com.bynder.unsplash.sdk.dto.PhotoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "unsplash", url = "https://api.unsplash.com", configuration = {FeignConfig.class})
public interface UnsplashClient {
    @RequestMapping(method = RequestMethod.GET, value = "/photos?client_id=cldjojM-4rJ5c8mvCvHv-PAQq_fltmJPJxYoAf2s-zk")
    List<PhotoResponse> getPhotos();

    @RequestMapping(method = RequestMethod.GET, value = "/collections?client_id=cldjojM-4rJ5c8mvCvHv-PAQq_fltmJPJxYoAf2s-zk")
    List<CollectionResponse> getCollections();

    @RequestMapping(method = RequestMethod.POST, value = "/collections")
    CollectionResponse addCollection(@RequestParam(value = "title", required = true) String title,
                                     @RequestParam(value = "description", required = false) String description,
                                     @RequestParam(value = "private", required = false) boolean isPrivate);

}
