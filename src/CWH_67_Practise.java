// Create three classes Calculator, ScCalculator and HybridCalculator and group them into a package
/* // Try solving with Vs code
package calc;

class Calculator{
    public void Calculator(int a , int b){
        System.out.println("The result is "+ a+b );
    }
}

class ScCalculator{
    public void Calculator(int a , int b){
        System.out.println("The result is "+ Math.sin(a+b) );
    }
}

class HyCalculator{
    public void Calculator(int a , int b){
        System.out.println("The result is "+ a+b );
        System.out.println("The result is "+ Math.sin(a+b) );
    }
}

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("I am the main function...");
        ScCalculator sc = new ScCalculator();
    }
}

 */


// 2. Create a package in class with three package levels folder, folderL1, folderL2
/*
package folder.folderl1.folderl2;

class ScCalculator{
    public void Calculator(int a , int b){
        System.out.println("The result is "+ Math.sin(a+b) );
    }
}

class HyCalculator{
    public void Calculator(int a , int b){
        System.out.println("The result is "+ a+b );
        System.out.println("The result is "+ Math.sin(a+b) );
    }
}

public class Problem2 {
      protected  int p = 5;
      int defInt = 46;
    public static void main(String[] args) {
        System.out.println("I am the main function...");
        ScCalculator sc = new ScCalculator();
    }
}

 */

/* 3. Use a button in package in java to write a class which displays a message(by sending sout) after
 taking i/p from user. */

/* Prove that you cannot access default property but can access protected property from the subclass */
/*
package folder.folderl1.folderl2;

class c1 extends Problem2{
    void Problem2(){
        System.out.println(p);
        // System.out.println(defInt);
    }
}

public class Problem4 {

    public static void main(String[] args) {
        c1 c = new c1();
        c.Problem2();

    }
}
 */
public class CWH_67_Practise {
    public static void main(String[] args) {

    }
}
