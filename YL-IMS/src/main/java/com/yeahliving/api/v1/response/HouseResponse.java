package com.yeahliving.api.v1.response;

import org.apache.commons.lang.StringUtils;

/**
 * Created by xingfeiy on 9/3/15.
 */
public class HouseResponse extends BaseResponse {

    private String houseID = StringUtils.EMPTY;

    public HouseResponse(String applicationID, ResponseCode code) {
        super(applicationID, code);
    }


    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }
}
