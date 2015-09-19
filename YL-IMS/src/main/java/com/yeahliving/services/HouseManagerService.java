package com.yeahliving.services;

/**
 * Created by xingfeiy on 9/3/15.
 */
public class HouseManagerService {

    private static HouseManagerService instance = null;

    private HouseManagerService() {
        //
    }

    public static HouseManagerService getInstance() {
        if(instance == null) {
            instance = new HouseManagerService();
        }
        return instance;
    }


    /**
     * check if this address is already existed.
     * @param addressId
     * @return <code>false</code> if this address is existed.
     */
    public boolean isExisted(String addressId) {
        //check if this address is already existed.
        return true;
    }
}
