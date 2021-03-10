package com.bynder.unsplash.sdk.controller;

import com.bynder.unsplash.sdk.dto.CollectionResponse;
import com.bynder.unsplash.sdk.service.CollectionService;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/collections")
public class CollectionController {
    CollectionService collectionService;

    @GetMapping
    @ApiOperation(value = "Retrieve collection lists")
    public ResponseEntity<List<CollectionResponse>> getCollections() {
        List<CollectionResponse> collections = collectionService.getCollections();
        if (collections == null)
            return ResponseEntity.noContent().build();
        else return ResponseEntity.ok(collections);
    }

}
