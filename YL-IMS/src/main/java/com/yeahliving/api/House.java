package main.java.com.yeahliving.api;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

/**
 * Created by xingfeiy on 7/20/15.
 */
@Path("/v1/house")
public class House {

    /**
     *
     * @param prefix_id,the prefix two letters(Shou pin of district or city), and database will generate the 5 digital numbers automatically.
     * @param province
     * @param city
     * @param district
     * @param street
     * @param door
     * @param sub_door
     * @param postal_code
     * @param area
     * @param type
     * @return
     */
    @Path("/insert")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public Response insert(@DefaultValue("") @QueryParam("pre_id") String prefix_id,
                           @DefaultValue("") @QueryParam("province") String province,
                           @DefaultValue("") @QueryParam("city") String city,
                           @DefaultValue("") @QueryParam("district") String district,
                           @DefaultValue("") @QueryParam("street") String street,
                           @DefaultValue("") @QueryParam("door") String door,
                           @DefaultValue("") @QueryParam("sub_door") String sub_door,
                           @DefaultValue("") @QueryParam("ps") String postal_code,
                           @DefaultValue("") @QueryParam("area") String area,
                           @DefaultValue("") @QueryParam("type") String type) {
        //todo
        //todo call third_part maps to get the lat/lon.
        return null;
    }

    @Path("/add_room")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public Response addRoom(@DefaultValue("") @QueryParam("house_id") String house_id,
                            @DefaultValue("") @QueryParam("room_ids") String[] room_ids) {
        //todo
        return null;
    }
}
