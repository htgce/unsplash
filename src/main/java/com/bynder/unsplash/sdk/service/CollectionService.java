package com.bynder.unsplash.sdk.service;

import com.bynder.unsplash.sdk.client.UnsplashClient;
import com.bynder.unsplash.sdk.dto.CollectionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {
    @Autowired
    UnsplashClient unsplashClient;

    public List<CollectionResponse> getCollections() {
        return unsplashClient.getCollections();
    }

    public CollectionResponse addCollection(String title, String description, boolean isPrivate) {
        return unsplashClient.addCollection(title, description, isPrivate);
    }
}
