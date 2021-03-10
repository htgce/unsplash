package com.bynder.unsplash.sdk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

public class PhotoResponse {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("width")
    private int width;
    @JsonProperty("height")
    private int height;
    @JsonProperty("color")
    private String color;
    @JsonProperty("alt_description")
    private String altDescription;
    @JsonProperty("urls")
    private Map<String, Object> urls;
    @JsonProperty("likes")
    private int likes;
    @JsonProperty("liked_by_user")
    private boolean likedByUser;
    @JsonProperty("links")
    private Map<String, Object> links;
    @JsonProperty("sponsorship")
    private Map<String, Object> sponsorship;
    @JsonProperty("user")
    private Map<String, Object> user;
}
