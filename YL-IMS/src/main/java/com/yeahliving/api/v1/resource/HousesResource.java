package com.yeahliving.api.v1.resource;

import com.yeahliving.api.v1.bean.House;
import com.yeahliving.api.v1.storage.SimpleHouseStorage;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingfeiy on 9/11/15.
 */
@Path("/houses")
public class HousesResource {
    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public Response add(House house) {
        System.out.println("Added house: " + house.toString());
        SimpleHouseStorage.add(house);

        return null;
    }

    /**
     * List all houses.
     * @return
     */
    @Path("/list")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<House> getHouses() {
        List<House> houses = new ArrayList<House>();
        //get all houses

        return houses;
    }

    /**
     * List all available houses.
     * @return
     */
    @Path("/available")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<House> getAvailableHouse() {
        List<House> houses = new ArrayList<House>();
        //get all houses

        return SimpleHouseStorage.getHouses();
    }

    /**
     * List all available houses.
     * @return
     */
    @Path("/new_added")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<House> getNewHouses() {
        List<House> houses = new ArrayList<House>();
        //get all houses

        return SimpleHouseStorage.getHouses();
    }

    @Path("/search")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public HouseResource getHouse(@PathParam("id") String id) {
        HouseResource hr = new HouseResource(uriInfo, request, id);
        //
        return hr;
    }

}
