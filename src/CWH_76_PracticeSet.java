class GM extends Thread{

    public void run(){
        int i = 0;

        while(i<5){
            System.out.println("Good Morning");
//            System.out.println("Thank you: " + this.getName());
            i++;
        }
    }
}

class W extends Thread{

    public void run(){
        int i = 0;

        while(i<2){

            System.out.println("Welcome");
//            System.out.println("Thank you: " + this.getName());
            i++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class CWH_76_PracticeSet {
    public static void main(String[] args) {
        /* Write a program to print "Good Morning" and "Welcome" continuously on the screen in java using threads. */
        /* Add a sleep method in welcome thread of question 1 to delay the execution for 200 ms. */
        /* Demonstrate getPriority() and setPriority() methods in java Threads. */
        GM g = new GM();
        W w = new W();

        g.setPriority(7);
        w.setPriority(2);

        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
//        g.start();
//        w.start();

        /* How do you get state of a given thread in java. */
        System.out.println(w.getState());
        /* How do you get reference to the current thread in java. */
        System.out.println(Thread.currentThread().getState());
    }
}
