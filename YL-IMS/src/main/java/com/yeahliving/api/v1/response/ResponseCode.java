package com.yeahliving.api.v1.response;


/**
 * Created by xingfeiy on 8/18/15.
 */
public enum ResponseCode {
    ALL_OK(13200, "OK"),

    INVALID_PARAMETER(13400, "INVALID_REQUEST"),

    USER_EXIST(13803, "USER_ALREADY_EXIST"),

    DATA_ACCESS_ERROR(13551, "INTERNAL_ERROR"),

    APPLICATION_AUTHENTICATION_FAILED(13805, "APPLICATION_AUTHENTICATION_FAILED");

    private final int serviceStatusCode;

    private final String serviceStatus;

    private ResponseCode(final int code, final String status) {

        this.serviceStatusCode = code;
        this.serviceStatus = status;
    }

    public int getServiceStatusCode() {
        return serviceStatusCode;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }
}
