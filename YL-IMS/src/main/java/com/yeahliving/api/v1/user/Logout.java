package com.yeahliving.api.v1.user;

import com.yeahliving.api.v1.BaseAPI;
import com.yeahliving.api.v1.response.LoginResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by xingfeiy on 8/18/15.
 */
@Path("/v1/welcome")
public class Logout extends BaseAPI {
    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Path("/logout")
    public LoginResponse logout(@DefaultValue("") @QueryParam("employee_number") String employeeNumber) {
        return null;
    }
}
