package com.hmlet.photosapp;

import com.hmlet.photosapp.resources.PhotosResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

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
        final PhotosResource resource = new PhotosResource();
        environment.jersey().register(resource);
    }
}