import java.util.Scanner;

public class CWH_19_Practice {
    public static void main(String[] args) {

        //-------------- QUESTION 1 ----------------
        /*  Write a program to find out whether a student
        *  is pass or fail; if it requires total 40% and at
        *  least 33% in each subject to pass. Assume 3 subject
        *  and take marks as input from the user. */
       /*
        int math, science, english ;
        float total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Math marks: ");
        math = sc.nextInt();
        System.out.print("Enter your Science marks: ");
        science = sc.nextInt();
        System.out.print("Enter your English marks: ");
        english = sc.nextInt();

        total= ((math+english+science)*100)/300;

        System.out.println("You overall percentage: "+total);

        if(total>=40 && math>=33 && science>=33 && english>=33){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }  */


        //-------------- QUESTION 2 ----------------
        /* Calculate income tax paid by an employee to the government as
        per the stats mentioned below:
        INCOME SALE --------- TAX
        2.5L - 5.0L            5%
        5.0L - 10.0L           20%
        Above 10.0L            30%
        Note that there is no tax below 2.5L
        */
        /*
        int salary;
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        salary = sc.nextInt();

        if(salary <= 250000){
            tax = 0f;
            System.out.println("You dont have to pay any taxes.");
        }
        else if (salary<=500000) {
            tax = tax + (salary-250000)*0.05f;
            System.out.print("Your tax amount is: "+tax);
        }
        else if (salary<=1000000) {
            tax = tax + (salary-250000)*0.05f;
            tax = tax + (salary-500000)*0.2f ;
            System.out.print("Your tax amount is: "+tax);
        }
        else{
            tax = tax + (salary-250000)*0.05f;
            tax = tax + (salary-500000)*0.2f;
            tax = tax + (salary-1000000)*0.3f;
            System.out.print("Your tax amount is: "+tax);
        }
        */


        //-------------- QUESTION 3 ----------------
        /* Write a java program to find out the day of the week given the number 1 for Monday,2 for Tuesday.. and so on */

        /*
        int num;
        System.out.print("Enter a number between 1 to 7: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextByte();

        switch (num){
            case 1 -> {
                System.out.println("Monday.");
            }
            case 2 -> {
                System.out.println("Tuesday.");
            }
            case 3 -> {
                System.out.println("Wednesday.");
            }
            case 4 -> {
                System.out.println("Thursday.");
            }
            case 5 -> {
                System.out.println("Friday.");
            }
            case 6 -> {
                System.out.println("Saturday.");
            }
            case 7 -> {
                System.out.println("Sunday.");
            }
            default -> {
                System.out.println("WRONG INPUT!!! Please try to enter number between 1 to 7.");
            }
        }
        */

        //-------------- QUESTION 4 ----------------
        /* Write a java program to find whether a year entered by the user is a leap year or not. */

//        int year = 2012;
//
//
//        if((year % 4 ==0) && (year % 100 !=0) || (year % 400 ==0)){
//        /*
//       -- A century year is a year ending with 00.A century year is a leap year only if it is divisible by 400.
//       -- A leap year (except a century year) can be identified if it is exactly divisible by 4.
//       -- A century year should be divisible by 4 and 100 both.
//       -- A non-century year should be divisible only by 4.
//         */
//            System.out.println(year+ " is a leap year.");
//        }
//        else {
//            System.out.println(year+ " is not a leap year.");
//        }


        //-------------- QUESTION 5 ----------------

        /*  Write a program to find out the type of website form the url
          .com = commercial web
          .org = organization web
          .in  = indian web  */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your website URL: ");
        String website = sc.next();

        if(website.endsWith(".com")){
            System.out.println("This is a Commercial website. ");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is a Organizational website. ");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is a Indian website. ");
        }



    }
}
