package com.yeahliving.api.v1.request;

import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by xingfeiy on 7/21/15.
 */
public class LoginRequest {
    @XmlElement(name = "usr")
    private String userName = StringUtils.EMPTY;

    //it's MD5 string.
    @XmlElement(name = "pwd")
    private String password = StringUtils.EMPTY;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
