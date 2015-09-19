package com.yeahliving.api.v1.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by xingfeiy on 8/27/15.
 */
@Path("/v1/admin/employee")
public class EmployeeResource {

//    @Path("/add")
//    @POST
//    @Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
//    public Response add(@QueryParam("emp_id") String employeeNumber,
//                        @QueryParam("emp_name") String employeeName,
//                        @QueryParam("id") String id) {
//        System.out.println("Added Employee: " + employeeName + ";" + employeeName + "; " + id);
//        return Response.status(200).entity("").build();
//    }


}
