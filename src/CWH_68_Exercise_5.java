package com.codewithharry.shape;

/*
*** WRITE THIS CODE IN NOTEPAD ***
 You have to create a package named com.codewithharry.shape
 This package should have individual classes for Rectangle, Square, Circle, Cylinder, Sphere
 These classes should use inheritance to properly manage the code!
 Include methods like volume, surface area and getters/setters for dimensions
 */
class properties{
    public int length;
    public int breadth;
    public int height;
    public int radius;
}
class Rectangle extends properties{
    Rectangle(int length, int breadth, int height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    public void area(){
        System.out.println("Area of rectangle is: "+ (this.length*this.breadth));
    }
    public void volume(){
        System.out.println("Volume of rectangle is: "+ (this.length*this.breadth*this.height));
    }
}

class Square extends properties{
    Square(int length){
        this.length = length;
    }
    public void area(){
        System.out.println("Area of square is: "+ (this.length*this.length));
    }
    public void volume(){
        System.out.println("Volume of square is: "+ (this.length*this.length*this.length));
    }
}

class Circle extends properties{
    Circle(int radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Area of circle is: "+ (Math.PI*this.radius*this.radius));
    }
}

// ((2* Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius))
class Cylinder extends properties{
    Cylinder(int radius , int height){
        this.radius = radius;
        this.height = height;
    }
    public void area(){
        System.out.println("Surface area of cylinder is: "+ ((2* Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius)));
    }
    public void volume(){
        System.out.println("Volume of cylinder is: "+ (Math.PI*this.radius*this.radius*this.height));
    }
}

class Sphere extends properties{
    Sphere(int radius){
        this.radius = radius;
    }
    public void area(){
        System.out.println("Surface area of sphere is: "+ (4*Math.PI*this.radius*this.radius));
    }
    public void volume(){
        System.out.println("Volume of sphere is: "+ ((4/3)*Math.PI*this.radius*this.radius*this.radius));
    }
}

public class CWH_68_Exercise_5 {
    public static void main(String[] args) {

        Sphere sp = new Sphere(6);
        sp.volume();

    }
}
