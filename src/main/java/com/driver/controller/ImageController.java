package com.driver.controller;

import com.driver.models.Blog;
import com.driver.models.Image;
import com.driver.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/images")
public class ImageController {

    @PostMapping("/{blogId}/add-image")
    public ResponseEntity<String> addImage(@PathVariable int blogId, @RequestParam String description, @RequestParam String dimensions) {
        // Add image into the give blog
        return new ResponseEntity<>("Added image successfully", HttpStatus.OK);
    }

    @GetMapping("/countImagesInScreen/{id}/{screenDimensions}")
    public ResponseEntity<Integer> countImagesInScreen(@PathVariable int id, @PathVariable String screenDimensions){
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable int id) {
        // delete image using deleteById
        return new ResponseEntity<>(HttpStatus.OK);
    }
}



