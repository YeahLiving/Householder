package com.yeahliving.api.v1.resource;

import com.yeahliving.api.v1.bean.House;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * Created by xingfeiy on 9/11/15.
 */
public class HouseResource {
    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    private String houseID = StringUtils.EMPTY;

    public HouseResource(UriInfo uriInfo, Request request, String houseID) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.houseID = houseID;
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public House getHouse() {
        //todo
        return new House();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response update(House house) {
        //todo
        return null;
    }

    @DELETE
    public Response delete() {
        //todo
        return null;
    }

}
