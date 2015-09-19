package com.yeahliving.api.v1.response;

import com.google.common.base.Objects;

/**
 * Created by xingfeiy on 8/18/15.
 */
public class ServiceStatus {
    private String message;

    private int status;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.status).add("message", this.message).toString();
    }
}
