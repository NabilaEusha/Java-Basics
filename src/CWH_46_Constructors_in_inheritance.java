class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am a constructor with the value a: "+a);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(0); // base class er argument wala constructor chalaite hoile "super" class use korte hbe
        System.out.println("I am a derived class constructor");
    }
    Derived1(int a , int b){
        super(a); // base class er argument wala constructor chalaite hoile "super" class use korte hbe
        System.out.println("I am a constructor with the value b: "+b);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println(" I am a child of derived constructor");
    }
    ChildOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am a constructor with the value c: "+c);
    }
}

public class CWH_46_Constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1(1);
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(44,99);
        ChildOfDerived ch = new ChildOfDerived(55,66,88);

    }
}
