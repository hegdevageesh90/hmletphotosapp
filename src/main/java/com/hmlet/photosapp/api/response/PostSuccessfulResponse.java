package com.hmlet.photosapp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

@JsonSnakeCase
public class PostSuccessfulResponse extends BaseResponse {
    @JsonProperty
    private String postSuccessMessage;

    public PostSuccessfulResponse(boolean isError, String errorMessage, String errorCode, String postSuccessMessage) {
        super(isError, errorMessage, errorCode);
        this.postSuccessMessage = postSuccessMessage;
    }

    public PostSuccessfulResponse(String postSuccessMessage) {
        this.postSuccessMessage = postSuccessMessage;
    }
}
