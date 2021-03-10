package com.bynder.unsplash.sdk.controller;

import com.bynder.unsplash.sdk.dto.PhotoResponse;
import com.bynder.unsplash.sdk.service.PhotoService;
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
@RequestMapping("/photos")
public class PhotoController {

    PhotoService photoService;

    @GetMapping
    @ApiOperation(value = "Retrieve photo lists")
    public ResponseEntity<List<PhotoResponse>> getPhotos() {
        List<PhotoResponse> photos = photoService.getPhotos();
        if (photos == null)
            return ResponseEntity.noContent().build();
        else return ResponseEntity.ok(photos);
    }

}
