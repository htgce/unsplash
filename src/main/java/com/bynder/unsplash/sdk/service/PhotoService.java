package com.bynder.unsplash.sdk.service;

import com.bynder.unsplash.sdk.client.UnsplashClient;
import com.bynder.unsplash.sdk.dto.PhotoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    UnsplashClient unsplashClient;

    public List<PhotoResponse> getPhotos() {
        return unsplashClient.getPhotos();
    }
}
