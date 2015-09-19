package com.yeahliving.api.v1.storage;

import com.yeahliving.api.v1.bean.House;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingfeiy on 9/19/15.
 */
public class SimpleHouseStorage {
    private static final List<House> houses = new ArrayList<House>();
    static {
        House house = new House();
        house.setHouseID("1001");
        house.setArea(120);
        house.setHouseType("2b2b2b");
        houses.add(house);

        House house1 = new House();
        house1.setHouseID("1002");
        house1.setArea(120);
        house1.setHouseType("2b2b2b");
        houses.add(house1);
    }

    public static House getHouse(String id) {
        for(House house  : houses) {
            if(StringUtils.equalsIgnoreCase(house.getHouseID(), id)) {
                return house;
            }
        }
        return null;
    }

    public static List<House> getHouses() {
        return houses;
    }

    public static void add(House house) {
        houses.add(house);
    }
}
