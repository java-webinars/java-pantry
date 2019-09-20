package edu.javacourse.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/simple")
public class SimpleRest
{
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public SimpleBean getBean() {
        return new SimpleBean("First", "Last");
    }
}
