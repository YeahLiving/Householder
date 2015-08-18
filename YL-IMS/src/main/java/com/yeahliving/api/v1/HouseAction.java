package com.yeahliving.api.v1;

import com.yeahliving.api.v1.response.DatabaseResponse;
import com.yeahliving.datatypes.objs.House;

import javax.ws.rs.*;

/**
 * Created by xingfeiy on 7/20/15.
 */
@Path("/v1/house")
public class HouseAction {
    @Path("/add")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public DatabaseResponse add(House house) {
        //todo
        return null;
    }

    @Path("/update")
    @GET
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
    public DatabaseResponse search(@DefaultValue("") @QueryParam("house_id") String houseID) {
        //todo
        return null;
    }
}
