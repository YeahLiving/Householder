package com.yeahliving.datatypes.objs;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by xingfeiy on 7/21/15.
 */
public class Payment {
    @XmlElement(name = "payment_id")
    private int paymentID = 0;
}
