package com.bynder.unsplash.sdk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class CollectionResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("published_at")
    private String publishedAt;
    @JsonProperty("last_collected_at")
    private String lastCollectedAt;
    @JsonProperty("curated")
    private Boolean curated;
    @JsonProperty("featured")
    private Boolean featured;
    @JsonProperty("total_photos")
    private Integer totalPhotos;
    @JsonProperty("share_key")
    private String shareKey;
    @JsonProperty("tags")
    List tags;
    @JsonProperty("links")
    Map<String, Object> links;
    @JsonProperty("user")
    Map<String, Object> user;
    @JsonProperty("cover_photo")
    Map<String, Object> coverPhoto;
    @JsonProperty("preview_photos")
    List previewPhotos;
}
