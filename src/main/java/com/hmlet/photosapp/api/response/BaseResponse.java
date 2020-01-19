package com.hmlet.photosapp.api.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.jackson.JsonSnakeCase;

@JsonSnakeCase
public class BaseResponse {
    @JsonProperty
    private boolean isError;

    @JsonProperty
    private String errorMessage;

    @JsonProperty
    private String errorCode;

    public BaseResponse(boolean isError, String errorMessage, String errorCode) {
        this.isError = isError;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public BaseResponse() {
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
