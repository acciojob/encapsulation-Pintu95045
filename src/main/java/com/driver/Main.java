package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj=new RWOnly();
        obj.setName("Pintu");
        System.out.println(obj.getName());

        // error- java: name has private access in com.driver.RWOnly

    }
}