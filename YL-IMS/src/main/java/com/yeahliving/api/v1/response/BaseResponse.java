package com.yeahliving.api.v1.response;

import com.google.common.base.Objects;

/**
 * Created by xingfeiy on 8/18/15.
 */
public class BaseResponse {

    protected ServiceStatus status;

    public ServiceStatus getStatus() {
        return this.status;
    }

    public void setStatus(final ServiceStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.status).toString();
    }

}
