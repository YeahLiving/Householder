package com.yeahliving.api.v1.user;

import com.yeahliving.api.v1.BaseAPI;
import com.yeahliving.api.v1.request.LoginRequest;
import com.yeahliving.api.v1.response.LoginResponse;
import com.yeahliving.api.v1.response.ResponseCode;
import com.yeahliving.datatypes.objs.Employee;
import com.yeahliving.services.IdentityService;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by xingfeiy on 7/20/15.
 */
@Path("/v1/welcome")
public class Login extends BaseAPI {
    private static Logger logger = Logger.getLogger(Login.class);

    @Path("/login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public LoginResponse login(LoginRequest request) {
        final LoginResponse response = new LoginResponse();

        if(request == null) {
            response.setCode(ResponseCode.APPLICATION_AUTHENTICATION_FAILED);
            response.setMessage("Invalid user name or password.");
            return response;
        }
        logger.info(request.getUserName() + " login.");

        final IdentityService service = new IdentityService();
        Employee employee = service.login(request.getUserName(), request.getPassword());
        if(employee == null) {
            response.setCode(ResponseCode.APPLICATION_AUTHENTICATION_FAILED);
            response.setMessage("Invalid user name or password.");
            return response;
        }

        response.setCode(ResponseCode.ALL_OK);
        response.setMessage("Login in succeed.");

        return response;
    }


}
