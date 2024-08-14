public class CWH_32_method_Overloading {

    static void tellJoke(){
        System.out.println("Chuppo");
    }

    static void change1(int a){
        a = 98;
    }

    static void change2(int[] arr){
        arr[0] = 87;
    }

    static void foo(){
        System.out.println("Good Morning bro");
    }

    static void foo(int a){
        System.out.println("Good Morning "+a+" bro");
    }

    static void foo(int a, int b){
        System.out.println("Good Morning "+a+" bro");
        System.out.println("Good Morning "+b+" bro");
    }

    public static void main(String[] args) {
//        tellJoke();

        // Case 1: Changing the integer
//        int x=45;
//        change1(x);
//        System.out.println("The value of x after running change is: "+x);

        // Case 2: Changing the Array
//        int[] marks = {12, 16,19,26};
//        change2(marks); //array te amra obj. er ref. pass kori, obj. er copy pass kori na, ref. er copy pass kori tai change hoi!
//        System.out.println("The value of marks[0] after running change is: "+marks[0]);

        //-------METHOD OVERLOADING-------
        foo();
        foo(60);
        foo(46,60);
        //Arguments are actual
    }
}
