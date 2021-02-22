package com.company;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("red",true,3,4,5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);
    }

}
