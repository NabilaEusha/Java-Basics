// p1.
abstract class Pen{
   abstract void write();
   abstract void refill();
}

// p2.
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing with Fountain Pen");
    }
    @Override
    public void refill(){
        System.out.println("Writing with Fountain Pen");
    }
    void changeNib(){
        System.out.println("Changing the nib..");
    }
}

// p3.
class Monkey{

    void jump(){
        System.out.println("Jumping..");
    }

    void bite() {
        System.out.println("Biting..");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating....");
    }
    @Override
    public void sleep(){
        System.out.println("Slepping....");
    }

    public void speak(){
        System.out.println("Hi!!");
    }
}

// p4.
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends TelePhone{

    @Override
    void ring() {
        System.out.println("Telephone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lift the telephone.");
    }

    @Override
    void disconnect() {
        System.out.println("Call disconnected");
    }
}

// p6.
interface TvRemote{
    void turnOn();
    void turnOff();
    void changeChannel();
}

class SmartTVRemote implements TvRemote{
    @Override
    public void turnOn() {
        System.out.println("Turning on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off..");
    }

    @Override
    public void changeChannel(){
        System.out.println("changing the channel...");
    }

    public void useAsACController(){
        System.out.println("using as AC Controller mode...");
    }
}

// p7.

class Tv implements TvRemote{

    @Override
    public void turnOn() {
        System.out.println("Turning on..");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off..");
    }

    @Override
    public void changeChannel() {
        System.out.println("changing the channel...");
    }

    void showChannel(){
        System.out.println("showing the channel");
    }
}
public class CWH_60_Practice {
    public static void main(String[] args) {
/* 1. Create an abstract class pen with methods write() and refill() as abstract methods */
/* 2. Use the pen class from Q1 to create a concrete class FountainPen with additional method changeNib() */

        FountainPen fp = new FountainPen();
        fp.write();
        fp.changeNib();

/* 3. Create a class monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class
and implements BasicAnimal interface with eat() and step methods. */

        Human Redima = new Human();
        Redima.jump();
        Redima.eat();
/* 4. Create a class TelePhone with ring() ,lift() and disconnect() methods as abstract methods,
 Create another class SmartTelePhone and demonstrate polymorphism */

        TelePhone t = new SmartTelephone();
        t.disconnect();

/* 5. Demonstrate polymorphism using monkey class from q3 */
        Monkey m1 = new Human();
//        m1.speak() //---> Cant use speak method because the reference is monkey which doesnot have speak method
        m1.bite();

/* 6. Create an interface TVRemote and use it to inherit another Interface SmartTvRemote */
        SmartTVRemote st = new SmartTVRemote();
        st.changeChannel();
        st.useAsACController();

        TvRemote st1 = new SmartTVRemote();
//        st1.useAsACController();// error
        st1.turnOff();
/* 7. Create a class Tv which implements TvRemote interface from Q6 */
        Tv tv = new Tv();
        tv.showChannel();
    }
}
