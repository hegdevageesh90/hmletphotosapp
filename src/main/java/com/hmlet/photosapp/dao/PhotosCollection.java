package com.hmlet.photosapp.dao;

import com.hmlet.photosapp.core.Photo;

import java.util.List;

public class PhotosCollection {
    private List<Photo> photoList;

    public PhotosCollection(List<Photo> photoList) {
        this.photoList = photoList;
    }

    public PhotosCollection() {
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }
}
