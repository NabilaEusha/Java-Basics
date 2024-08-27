interface Bicycle{
    int a = 46;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{

    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("pee pee, poo poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake!!!");
    }
    public void speedUp(int increment){
        System.out.println("Applying speed!!!");
    }
    public void blowHornK3g(){
        System.out.println("kabhi khusi kabhi gum !!!");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa!!!");
    }
}

public class CWH_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleNabila = new AvonCycle();
        cycleNabila.speedUp(5);
        // you can create properties in interface
        System.out.println(cycleNabila.a);

        // you can not modify properties in interface
//        cycleNabila.a = 45;// error

        cycleNabila.blowHornK3g();
        cycleNabila.blowHornmhn();
    }
}
