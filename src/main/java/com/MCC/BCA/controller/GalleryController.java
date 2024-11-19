package com.MCC.BCA.controller;

import com.MCC.BCA.entity.Gallery;
import com.MCC.BCA.service.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/gallery")
public class GalleryController {
    @Autowired
    private GalleryService service;
    @PostMapping("/upload")
    public ResponseEntity<Gallery> handleFileUpload(@RequestBody Gallery gallery) {
        return ResponseEntity.ok(service.upload(gallery));
    }
    @GetMapping("/showAll")
    public ResponseEntity<List<Gallery>> showAllImages() {
        return ResponseEntity.ok(service.showAllImages());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteImgById(@PathVariable Long id) {
        service.deleteImgById(id);
        return ResponseEntity.ok().build();
    }
}
