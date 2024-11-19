package com.MCC.BCA.service;

import com.MCC.BCA.entity.Gallery;
import com.MCC.BCA.library.DateAndTime;
import com.MCC.BCA.repository.GalleryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryService {
    private final GalleryRepository repository;

    @Autowired
    public GalleryService(GalleryRepository repository) {
        this.repository = repository;
    }

    public Gallery upload(Gallery gallery) {
        Gallery newUpload = new Gallery(gallery.getUrl(), DateAndTime.currentDateTime());
        return repository.save(newUpload);
    }

    public List<Gallery> showAllImages() {
        return repository.findAll();
    }
    public void deleteImgById(Long id) {
        repository.deleteById(id);
    }
}
