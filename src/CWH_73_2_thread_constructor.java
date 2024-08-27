class MyThread extends Thread implements Runnable{
    public MyThread(int r, String name){
        super(name);
    }
    public void run(){
        System.out.println("Hi");
    }
}

public class CWH_73_2_thread_constructor {
    public static void main(String[] args) {
        MyThread t = new MyThread(12,"Nabila");
        Thread g = new Thread(t);

        g.start();

        System.out.println(g.getId());
        System.out.println(g.getName());

    }
}
