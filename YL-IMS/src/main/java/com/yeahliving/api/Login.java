package main.java.com.yeahliving.api;

import main.java.com.yeahliving.datatypes.records.LoginResponse;

import javax.ws.rs.*;

/**
 * Created by xingfeiy on 7/20/15.
 */
@Path("/v1/welcome")
public class Login {

    /**
     *
     * @param username
     * @param password encrypt the password
     * @return
     */
    @Path("/login")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public LoginResponse login(@DefaultValue("") @QueryParam("usr") String username,
                               @DefaultValue("") @QueryParam("pwd") String password) {
        //todo
        return null;
    }

}
