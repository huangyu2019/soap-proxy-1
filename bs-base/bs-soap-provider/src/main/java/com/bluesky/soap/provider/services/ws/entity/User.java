package com.bluesky.soap.provider.services.ws.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @ClassName User
 * @Description TO DO
 * @Author lenovo
 * @Date 2024/5/5
 * @Version 1.0
 **/ 
@XmlRootElement(name = "user")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
    @XmlElement(name = "userName", required = true, namespace="http://ws.services.provider.soap.bluesky.com")
    private String userName;

    @XmlElement(name = "age", required = true, namespace="http://ws.services.provider.soap.bluesky.com")
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
