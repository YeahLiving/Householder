package com.yeahliving.api.v1.response;


/**
 * Created by xingfeiy on 7/20/15.
 */
public class LoginResponse extends BaseResponse {
    public LoginResponse() {
    }

    public LoginResponse(String applicationID, ResponseCode code) {
        super(applicationID, code);
    }

}
