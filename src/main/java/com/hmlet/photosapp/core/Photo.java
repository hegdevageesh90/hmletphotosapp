package com.hmlet.photosapp.core;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

@JsonSnakeCase
public class Photo {
    @JsonProperty
    private String id;

    @JsonProperty
    private String state;

    @JsonProperty
    private String caption;

    @JsonProperty
    private String date;

    @JsonProperty
    private User user;

    @JsonProperty
    private Size size;

    public Photo(String id, String state, String caption, String date, User user, Size size) {
        this.id = id;
        this.state = state;
        this.caption = caption;
        this.date = date;
        this.user = user;
        this.size = size;
    }

    public Photo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
