package com.sunglowsys.domain;

import java.util.Objects;

public class Address {

    private  Long id;
    private String addressLine1 ;
    private String addressLine2 ;
    private String village ;
    private String post ;
    private String district ;
    private String state ;
    private String country ;
    private String zipCode ;


    public void getId() {
        System.out.println("addId:"+id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void getAddressLine1() {
        System.out.println("add 1:"+addressLine1);
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void getAddressLine2() {
        System.out.println("add 2:"+addressLine2);
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void getVillage() {
        System.out.println("village:"+village);
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void getPost() {
        System.out.println("post:"+post);
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void getDistrict() {
        System.out.println("dist :"+district);
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void getState() {
        System.out.println("state:"+state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getCountry() {
        System.out.println("country:"+country);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void getZipCode() {
        System.out.println("zipCode:"+zipCode);
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(addressLine2, address.addressLine2) && Objects.equals(village, address.village) && Objects.equals(post, address.post) && Objects.equals(district, address.district) && Objects.equals(state, address.state) && Objects.equals(country, address.country) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressLine1, addressLine2, village, post, district, state, country, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", village='" + village + '\'' +
                ", post='" + post + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
