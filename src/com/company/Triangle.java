package com.company;

public class Triangle extends Shape{
    private int a;
    private int b;
    private int c;
    public Triangle(){}
    public Triangle(String color,boolean filled,int a,int b,int c){
        super(color,filled);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        return Math.sqrt((this.getPerimeter()/2)*((this.getPerimeter()/2)-a)*((this.getPerimeter()/2)-b)*((this.getPerimeter()/2)-c));
    }

    @Override
    public String toString() {
        return super.getColor()+", chu vi la : "+this.getPerimeter()+"dien tich la : "+ this.getArea()
                ;
    }
}
