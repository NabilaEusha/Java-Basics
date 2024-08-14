import javax.xml.namespace.QName;

//p1
class Employee1{
    int salary;
    String name;

    public String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String n){
        name = n;
    }
}
//p2. Create a class cellphone with methods to print "vibrating"....,"ringing"...etc
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}

//p3. Create a class square with a method to initialize its side , calculating area , perimeter etc
class square{
    int side;

    public int area(){
        int areaa= side*side;
        return  areaa;
    }

    public int perimeter(){
        int pm= 4*side;
        return  pm;
    }
}

//p4. Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting), running , firing etc
class TommyVecetti{
    public void hit(){
        System.out.println("Hitting the enemy.");
    }
    public void run(){
        System.out.println("Running from the enemy.");
    }
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
}

public class CWH_39_practice {
    public static void main(String[] args) {
        //p1
        Employee1 nabila = new Employee1();
        nabila.setName("Sultana");
        nabila.salary = 200;
        System.out.println(nabila.getName());
        System.out.println(nabila.getSalary());

        //p2
        cellPhone apple = new cellPhone();
        apple.ring();
        apple.vibrate();

        //p3
        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        //p4
        TommyVecetti tm = new TommyVecetti();
        tm.hit();
        tm.fire();
        tm.run();

    }
}
