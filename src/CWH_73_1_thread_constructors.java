class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("thank u");
    }
}

public class CWH_73_1_thread_constructors {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());
    }
}
