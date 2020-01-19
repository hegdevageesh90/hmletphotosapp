package com.hmlet.photosapp.resources;

import com.hmlet.photosapp.api.response.PostSuccessfulResponse;
import com.hmlet.photosapp.core.Photo;
import com.hmlet.photosapp.utils.Constants;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/photos")
@Produces(MediaType.APPLICATION_JSON)
public class PhotosResource {

    @POST
    @Path("/post")
    public PostSuccessfulResponse postPhoto(Photo request) {

        
        return new PostSuccessfulResponse(false, "", "", Constants.POST_SUCCESS_MESSAGE);
    }
}
