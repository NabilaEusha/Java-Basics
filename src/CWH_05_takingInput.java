import java.util.Scanner;

public class CWH_05_takingInput {
    public static void main(String[] args) {
        System.out.println("Taking input form the user ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter another number: ");
//        int b = sc.nextInt();
//        System.out.println("The sum of these two number is: "+(a+b));
//        boolean b1= sc.hasNextInt();//input integer kina check kore
//        System.out.println(b1);

//        String str = sc.next(); //only space ashar aag porjonto print korbe
//        System.out.println(str);

        String str = sc.nextLine();//full line print kore
        System.out.println(str);

    }
}
