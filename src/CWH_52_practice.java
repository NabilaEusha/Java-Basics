// p1.

class circle{
    public int radius;

    circle(){
        System.out.println("I am non parameterized circle constructor.");
    }
    public circle(int radius) {
        System.out.println("I am circle parameterized constructor");
        this.radius = radius;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
    public double perimeter(){
        return 2*Math.PI*this.radius;
    }

}
class cylinder1 extends circle{
    public int height;

     cylinder1(int radius,int height) {
        super(radius);
        System.out.println("I am cylinder parameterized constructor");

        this.height= height;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

// p2.


class rectangle1{
    public int length, breadth;

    public rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return this.breadth*this.length;
    }
}

class cuboid extends rectangle1{
    int height;

    public cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    @Override
    public int area(){
        return (2*this.breadth*this.length) + (2*this.height*this.length) + (2*this.breadth*this.height);
    }

    public int volume(){
        return this.height* this.breadth* this.length;
    }


}
public class CWH_52_practice {
    public static void main(String[] args) {
        /* p1.
        Create a class circle and use inheritance to create another class cylinder from it.
         */

//        circle c = new circle(12);
//        cylinder1 cy = new cylinder1(5,8);


        /* p2.
        Create a class rectangle and use inheritance to create another class cuboid.
        Try to keep it as close to real world scenario as possible.
        create methods for area and volume .also create getters and setters
         */
        rectangle1 rc = new rectangle1(4 ,7);
        System.out.println(rc.area());

        cuboid c = new cuboid(4,7,2);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
}
