package com.ExceptionDemo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car = new Car();
        int price = car.price(500000);
        String color = car.color();
        System.out.println("price= " + price);
        System.out.println("color= " + color);
    }
}
