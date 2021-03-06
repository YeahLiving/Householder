package com.yeahliving.api.v1;

import com.yeahliving.api.v1.bean.House;
import org.json.JSONObject;

import javax.ws.rs.*;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by xingfeiy on 8/17/15.
 * Visit: http://localhost:8080/api/v1/test/hi
 */
@Path("/v1/test")
public class Test {
    @Path("/hi")
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }

    public static void main(String[] args){

//        testLogin();
        testAddHouse();
//        testAddress();
//
//        try {
//
//            JSONObject data = new JSONObject();
//            data.put("usr", "Xingfei");
//            data.put("pwd", "123456");
//
//
////            JSONObject where = new JSONObject();
////            where.put("userID", userId);
////
////            JSONObject requestJson = new JSONObject();
////
////            if (additionalData != null && !additionalData.isEmpty()) {
////                for (String key : additionalData.keySet()) {
////                    // special logic if badge is "". remove badge
////                    if ("badge".equals(key) && "".equals(additionalData.get(key))) {
////                        data.remove(key);
////                    }
////                    data.put(key, additionalData.get(key));
////                }
////            }
////            requestJson.put("where", where);
////            requestJson.put("data", data);
//
//            System.out.println(data.toString());
//            final Response entity = ClientBuilder.newClient().target("http://localhost:8080/api/v1/welcome/login")
//                    .request(MediaType.APPLICATION_JSON)
////                    .header(MediaType.APPLICATION_JSON, "utf-8")
////                    .header("X-Parse-Application-Id", APPLICATION_ID).header("X-Parse-REST-API-Key", API_KEY)
//                    .post(Entity.entity(data.toString(), MediaType.APPLICATION_JSON));
////            final Response requestResponse = ClientBuilder.newClient().target("http://localhost:8080/api/v1/welcome/login")
////                    .request(MediaType.APPLICATION_JSON_TYPE).
////                            get();
//            if (entity.getStatus() == 200) {
////                returnValue = true;
//            }
//        } catch (JSONException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
    }

    private static void testLogin() {
        try {
            JSONObject data = new JSONObject();
            data.put("usr", "Xingfei");
            data.put("pwd", "123456");



            System.out.println(data.toString());
            final Response entity = ClientBuilder.newClient().target("http://localhost:8080/api/v1/welcome/login")
                    .request(MediaType.APPLICATION_JSON)
////                    .header(MediaType.APPLICATION_JSON, "utf-8")
////                    .header("X-Parse-Application-Id", APPLICATION_ID).header("X-Parse-REST-API-Key", API_KEY)
                    .post(Entity.entity(data.toString(), MediaType.APPLICATION_JSON));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void testAddHouse() {
        try {
            JSONObject data = new JSONObject();
            data.put("house_id", "001");
            data.put("area", "100");

            JSONObject addressJson = new JSONObject();
            addressJson.put("complex", "sichuan");
            data.put("address", addressJson);

            System.out.println(data.toString());
            final Response entity = ClientBuilder.newClient().target("http://localhost:8080/api/houses/add")
                    .request(MediaType.APPLICATION_JSON)
//                    .header(MediaType.APPLICATION_JSON_TYPE, "utf-8")
//                    .header("X-Parse-Application-Id", APPLICATION_ID).header("X-Parse-REST-API-Key", API_KEY)
//                    .post(Entity.entity(data.toString(), MediaType.APPLICATION_JSON), House.class);
                    .post(Entity.entity(data.toString(), MediaType.APPLICATION_JSON));
//            System.out.println(entity.toString());
        } catch (Exception  ex) {
            ex.printStackTrace();
        }

    }

}
