import java.util.Scanner;

public class CWH_12_Practice {
    public static void main(String[] args) {
        /* What will be the result of the following expression
        float a = 7/4 * 9/2; */

//        float a = 7 / 4 * 9 / 2;
//        System.out.println(a);
        /*
        = 1.75*9/2
        = 15.75/2
        = 7.875
         */

        /* Write a java program to encrypt a grade by adding 8
        to it to show the correct grade. */

//        char grade='B';
//        grade =(char)(grade+8);
//        System.out.println(grade);
//        // Decrypting the grade
//
//        grade =(char)(grade-8);
//        System.out.println(grade);

        /* Use Comparison operators to find out whether a given
         number is greater than the user entered number or not. */

//        Scanner sc = new Scanner(System.in);
//        int a =sc.nextInt();
//        System.out.println(a>8);

        /* Write the following expression in a java program
        v^2 - u^2
       -----------
          2*a*s
        */
        int v = 5;
        int u = 3;
        int a = 7;
        int s = 2;

        float k = v*v - (u*u)  /(2*a*s);
        System.out.println(k);

        /* What will be the result of the following expression
        int x=7;
        int a = 7+49/7+35/7; */
//        int x=7;
//        int a = 7+49/7+35/7;
//        System.out.println(a);

    }
}
