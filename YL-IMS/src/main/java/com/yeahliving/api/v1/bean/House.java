package com.yeahliving.api.v1.bean;

import com.yeahliving.datatypes.objs.Address;
import org.apache.commons.lang.StringUtils;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingfeiy on 9/11/15.
 */
@XmlRootElement(name = "house")
public class House extends DatabaseObject {
    @XmlAttribute(name = "house_id")
    private String houseID = StringUtils.EMPTY;

    @XmlElement(name = "address")
    private Address address;

    @XmlElement(name = "area")
    private float area;

    @XmlElement(name = "house_type")
    private String houseType;

    @XmlElement(name = "comments")
    private String comments;

    @XmlElement(name = "sell_intention")
    private boolean sellIntention = false;

    @XmlElement(name = "current_landlords")
    private List<Integer> currentLandlords = new ArrayList<Integer>();

    @XmlElement(name = "history_landlords")
    private List<Integer> historyLandlords = new ArrayList<Integer>();

    @XmlElement(name = "status")
    private Status status;

    public enum Status {
        LEASING,

        PARTIAL_LEASING,

        PENDING,

        DECORATING,

        CHECK_OUT;
    }

    public Address getAddress() {

        return new Address();
    }

    public String getHouseID() {
        return houseID;
    }

    public void setHouseID(String houseID) {
        this.houseID = houseID;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isSellIntention() {
        return sellIntention;
    }

    public void setSellIntention(boolean sellIntention) {
        this.sellIntention = sellIntention;
    }

    public List<Integer> getCurrentLandlords() {
        return currentLandlords;
    }

    public void setCurrentLandlords(List<Integer> currentLandlords) {
        this.currentLandlords = currentLandlords;
    }

    public List<Integer> getHistoryLandlords() {
        return historyLandlords;
    }

    public void setHistoryLandlords(List<Integer> historyLandlords) {
        this.historyLandlords = historyLandlords;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //
//    @Path("/update_addr")
//    public void setAddress(Address address) {
//        System.out.println("Update address: " + address);
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "House{" +
                "houseID='" + houseID + '\'' +
                ", address=" + address +
                ", area=" + area +
                ", houseType='" + houseType + '\'' +
                ", comments='" + comments + '\'' +
                ", sellIntention=" + sellIntention +
                ", currentLandlords=" + currentLandlords +
                ", historyLandlords=" + historyLandlords +
//                ", status=" + status +
                '}';
    }
}
