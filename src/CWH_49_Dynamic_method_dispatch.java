class Phone{
    public void greet(){
        System.out.println("Good Morning!!! ");
    }
    public void on(){
        System.out.println("The phone is on.. ");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("The smart phone is on.. ");
    }
    public void swagaat(){
        System.out.println("Swagaat hain apka! ");
    }

}

public class CWH_49_Dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();//Allowed
//        SmartPhone smobj = new SmartPhone();//Allowed

        Phone obj = new SmartPhone();
        obj.greet();
        obj.on();

    }
}
