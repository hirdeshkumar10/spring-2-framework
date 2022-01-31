package com.sunglowsys.test;

import com.sun.xml.internal.bind.CycleRecoverable;
import com.sunglowsys.domain.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

public class TestAddress {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Address address = (Address) applicationContext.getBean("address");
        address.getId();
        address.getAddressLine1();
        address.getAddressLine2();
        address.getVillage();
        address.getPost();
        address.getDistrict();
        address.getState();
        address.getCountry();
        address.getZipCode();
    }
}
