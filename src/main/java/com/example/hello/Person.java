package com.example.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

// @JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    private String name;
    private Integer age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public Person(String name, Integer age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
