package com.yeahliving.datatypes.objs;

import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by xingfeiy on 7/21/15.
 */
public class Address {
    /*
    Xiao Qu name
     */
    @XmlElement(name = "complex")
    private String complex = StringUtils.EMPTY;

    @XmlElement(name = "sub_door")
    private String subDoor = StringUtils.EMPTY;

    @XmlElement(name = "door")
    private String door = StringUtils.EMPTY;

    @XmlElement(name = "street")
    private String streetName = StringUtils.EMPTY;

    @XmlElement(name = "district")
    private String district = StringUtils.EMPTY;

    @XmlElement(name = "city")
    private String city = StringUtils.EMPTY;

    @XmlElement(name = "province")
    private String province = StringUtils.EMPTY;

    @XmlElement(name = "postal_code")
    private String postalCode = StringUtils.EMPTY;

    @XmlElement(name = "latlon")
    private String latlon = StringUtils.EMPTY;
}
