package com.bynder.unsplash.sdk.service;

import com.bynder.unsplash.sdk.client.UnsplashClient;
import com.bynder.unsplash.sdk.dto.PhotoResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Service
public class PhotoService {
    @Autowired
    UnsplashClient unsplashClient;

    public List<PhotoResponse> getPhotos() {
        return unsplashClient.getPhotos();
    }
}
