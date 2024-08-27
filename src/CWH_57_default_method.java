interface MyCamera{
    void takesnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning! ");
    }
    default void record4KVideo(){
        greet();
        System.out.println("recording in 4k...");
    }
}

interface MyWifi{
    String[] getNetWorks();
    void connectedToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){

    }
}

class  MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
    public void takesnap(){
        System.out.println("Taking snap..");
    }
    public void recordVideo(){
        System.out.println("Recording video!!!");
    }
//    public void record4KVideo(){
//        System.out.println("Recording video in 4k!!!");
//   }
    public String[] getNetWorks(){
        System.out.println("Getting List of Networks: ");
        String[] networkList = {"Harry", "Prashanth","Nabila5G"};
        return networkList;
    }
    public void connectedToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
}

public class CWH_57_default_method {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetWorks();
        for (String item: ar){
            System.out.println(item);
        }

//        ms.greet(); //throws error
    }
}
