package com.yeahliving.api.v1;

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
public class Login extends BaseAPI{
    private static Logger logger = Logger.getLogger(Login.class);

    @Path("/login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public LoginResponse login(LoginRequest request) {
        final LoginResponse response = new LoginResponse();

        if(request == null) {
            response.getStatus().setStatus(ResponseCode.INVALID_PARAMETER.getServiceStatusCode());
            return response;
        }
        logger.info(request.getUserName() + " login.");

        final IdentityService service = new IdentityService();
        Employee employee = service.login(request.getUserName(), request.getPassword());
        if(employee == null) {
            response.getStatus().setStatus(ResponseCode.APPLICATION_AUTHENTICATION_FAILED.getServiceStatusCode());
            return response;
        }

        response.getStatus().setStatus(ResponseCode.ALL_OK.getServiceStatusCode());
        response.setUserID(employee.getEmployeeNumber());
        return response;
    }

}
