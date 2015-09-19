package com.yeahliving.api.v1.house;

import com.yeahliving.api.v1.response.DatabaseResponse;
import com.yeahliving.api.v1.response.HouseResponse;
import com.yeahliving.datatypes.objs.Address;
import com.yeahliving.datatypes.objs.House;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;
import java.util.List;

/**
 * Created by xingfeiy on 7/20/15.
 */
@Path("/v1/house")
public class HouseResource {
    @Path("/available")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<House> getAvailableHouses() {
        //
        return Collections.EMPTY_LIST;
    }

    @Path("/recently")
    @GET
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public List<House> getRecentlyNewHouse() {
        //
        return Collections.EMPTY_LIST;
    }


    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public HouseResponse add(House house) {
        return null;
//        return house;
    }

//    @Path("/check_addr")
//    @GET
//    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
//    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
//    public HouseResponse checkAddress(Address address) {
//        return null;
//    }


    @Path("/update")
    @PUT
    @Produces("application/json")
    @Consumes("application/json")
    public DatabaseResponse update(House house) {
        //todo
        return null;
    }

    @Path("/search")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public DatabaseResponse searchByID(@DefaultValue("") @QueryParam("house_id") String houseID) {
        //todo
        return null;
    }
}
