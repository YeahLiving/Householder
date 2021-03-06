package com.yeahliving.datatypes.objs;

import org.apache.commons.lang.StringUtils;

import javax.ws.rs.Path;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingfeiy on 7/21/15.
 */
@XmlRootElement(name = "house")
public class House {

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

    @Path("/update_addr")
    public void setAddress(Address address) {
        System.out.println("Update address: " + address);
        this.address = address;
    }

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
