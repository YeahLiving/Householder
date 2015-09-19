package com.yeahliving.datatypes.objs;

import com.google.gson.Gson;

/**
 * Created by xingfeiy on 7/21/15.
 */
public abstract class BaseObj {
    private static Gson gson = new Gson();

    @Override
    public String toString() {
        return gson.toJson(this);
    }

    public int compareTo(Object o) {
        return 0;
    }
}
