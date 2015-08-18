package com.yeahliving.api.v1.response;


/**
 * Created by xingfeiy on 7/20/15.
 */
public class LoginResponse extends BaseResponse {
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
