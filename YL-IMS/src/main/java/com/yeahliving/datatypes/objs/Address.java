package com.yeahliving.datatypes.objs;

import com.yeahliving.utils.HashingUtil;
import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xingfeiy on 7/21/15.
 */
@XmlRootElement(name = "address")
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


    private long id = Long.MIN_VALUE;

    public String getComplex() {
        return complex;
    }

    public void setComplex(String complex) {
        this.complex = complex;
    }

    public String getSubDoor() {
        return subDoor;
    }

    public void setSubDoor(String subDoor) {
        this.subDoor = subDoor;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getLatlon() {
        return latlon;
    }

    public void setLatlon(String latlon) {
        this.latlon = latlon;
    }

    @Override
    public String toString() {
        return "Address{" +
                "complex='" + complex + '\'' +
                ", subDoor='" + subDoor + '\'' +
                ", door='" + door + '\'' +
                ", streetName='" + streetName + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", latlon='" + latlon + '\'' +
                '}';
    }

    public long getId() {
        if(id == Long.MIN_VALUE) {
            StringBuilder sb = new StringBuilder().append(complex).
                    append("/").append(subDoor).append("/").
                    append(door).append("/").append(streetName).append("/").
                    append(district).append("/").append(city).append("/").
                    append(province).append("/").append(postalCode);
            id = HashingUtil.encodeMD5(sb.toString().trim());
        }
        return id;
    }
}
