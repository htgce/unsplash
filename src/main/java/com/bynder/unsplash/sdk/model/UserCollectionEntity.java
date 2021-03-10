package com.bynder.unsplash.sdk.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCollectionEntity {
    private int id;
    private String title;
    private String publishedAt;
    private String lastCollectedAt;
    private String updatedAt;
    private String coverPhoto;
}
