package com.yeahliving.api.v1.bean;

/**
 * Created by xingfeiy on 9/19/15.
 */
public abstract class DatabaseObject {

    protected boolean locked = true;

    public boolean isLocked() {
        return locked;
    }

    public synchronized void setLocked(boolean locked) {
        this.locked = locked;
    }
}
