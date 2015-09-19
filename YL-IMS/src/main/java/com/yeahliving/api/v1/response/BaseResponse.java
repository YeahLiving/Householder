package com.yeahliving.api.v1.response;

import com.google.common.base.Objects;
import org.apache.commons.lang.StringUtils;

/**
 * Created by xingfeiy on 8/18/15.
 */
public class BaseResponse {

    protected String applicationID = StringUtils.EMPTY;

    protected ResponseCode code;

    protected String message = StringUtils.EMPTY;

    public BaseResponse() {
    }

    public BaseResponse(String applicationID, ResponseCode code) {
        this.applicationID = applicationID;
        this.code = code;
    }

    public boolean succeed() {
        return ResponseCode.ALL_OK.equals(this.code);
    }

    public String getApplicationID() {
        return applicationID;
    }

    public ResponseCode getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
