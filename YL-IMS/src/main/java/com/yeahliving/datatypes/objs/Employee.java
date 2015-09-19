package com.yeahliving.datatypes.objs;

import org.apache.commons.lang.StringUtils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by xingfeiy on 7/21/15.
 */
@XmlRootElement
public class Employee {
    //the employee number in company.
    @XmlElement(name = "employee_numbeer")
    private String employeeNumber = StringUtils.EMPTY;

    @XmlElement(name = "name")
    private String name = StringUtils.EMPTY;

    @XmlElement(name = "age")
    private int age = 0;

    @XmlElement(name = "identity")
    private String identity = StringUtils.EMPTY;

    @XmlElement(name = "married")
    private boolean married = false;

    @XmlElement(name = "phone")
    private String phone = StringUtils.EMPTY;

    //cell phone number
    @XmlElement(name = "mobile")
    private String mobile = StringUtils.EMPTY;

    @XmlElement(name = "email")
    private String email = StringUtils.EMPTY;

    @XmlElement(name = "address")
    private Address address = null;

    @XmlElement(name = "contact")
    private Contact emergencyContact = null;

    @XmlElement(name = "department")
    private Department department;

    //the value is false if this employee is part time.
    @XmlElement(name = "job_type")
    private boolean jobType = true;

    @XmlElement(name = "position")
    private Position position ;

    //the job number of supervisor.
    @XmlElement(name = "supervisor")
    private String supervisor;


    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(Contact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isJobType() {
        return jobType;
    }

    public void setJobType(boolean jobType) {
        this.jobType = jobType;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
