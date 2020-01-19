package com.hmlet.photosapp;

import com.hmlet.photosapp.core.Photo;
import com.hmlet.photosapp.dao.PhotosCollection;
import com.hmlet.photosapp.resources.PhotosResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.util.ArrayList;

public class HmletPhotosAppApplication extends Application<HmletPhotosAppConfiguration> {
    public static void main(String[] args) throws Exception {
        new HmletPhotosAppApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<HmletPhotosAppConfiguration> bootstrap) {
    }

    @Override
    public void run(HmletPhotosAppConfiguration configuration,
                    Environment environment) {
        PhotosCollection photosCollection = new PhotosCollection(new ArrayList<Photo>());
        final PhotosResource resource = new PhotosResource(photosCollection);
        environment.jersey().register(resource);
    }
}