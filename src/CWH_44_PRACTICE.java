/*  p1.
    Create a class cylinder and use getters and setters to set its
    radius and height
 */
class cylinder{
    private int radius, height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

    public double surfaceArea(){
        return ((2* Math.PI * radius*radius) + (2* Math.PI * radius*height));
    }
}

/*  p2.
Use p1 to calculate surface area and volume of the cylinder
 */
/*  p3.
Use a constructor and repeat p1
 */
/* p4.
Overload a constructor used to initialize a rectangle of length 4 and breadth 5
for using custom parameters
*/

class rectangle{
    private int height, breadth;

    public rectangle() {
        this.height = 4;
        this.breadth = 5;
    }

    public rectangle(int height, int breadth) {
        this.height = height;
        this.breadth = breadth;
    }

    public int getHeight() {
        return height;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class CWH_44_PRACTICE {
    public static void main(String[] args) {
        //p1
/*
    cylinder myCylinder = new cylinder(9 ,12);
//    myCylinder.setHeight(12);
//    myCylinder.setRadius(9);
        System.out.println(myCylinder.getHeight());
        int r = myCylinder.getRadius();
        System.out.println(r);

     //p2
        System.out.println("Surface area: "+myCylinder.surfaceArea());
        System.out.println("Volume: "+myCylinder.volume());
 */

        //p3
        rectangle r = new rectangle(7,9);
        System.out.println(r.getHeight());
        System.out.println(r.getBreadth());

    }
}
