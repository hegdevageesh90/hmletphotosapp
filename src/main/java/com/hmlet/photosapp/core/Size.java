package com.hmlet.photosapp.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

@JsonSnakeCase
public class Size {
    @JsonProperty
    private Integer bytes;

    @JsonProperty
    private Dimensions dimensions;

    public Size(Integer bytes, Dimensions dimensions) {
        this.bytes = bytes;
        this.dimensions = dimensions;
    }

    public Size() {
    }

    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
