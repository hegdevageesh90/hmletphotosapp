package com.hmlet.photosapp.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/photos")
@Produces(MediaType.APPLICATION_JSON)
public class PhotosResource {

    @GET
    @Timed
    public Response dummyResp() {
        return Response.ok().build();
    }
}
