package com.hmlet.photosapp.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

@JsonSnakeCase
public class Dimensions {
    @JsonProperty
    private Integer height;

    @JsonProperty
    private Integer width;

    public Dimensions(Integer height, Integer width) {
        this.height = height;
        this.width = width;
    }

    public Dimensions() {
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}
