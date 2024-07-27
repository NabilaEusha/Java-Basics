import java.util.Scanner;

public class CWH_18_Elseif {
    public static void main(String[] args) {

        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18 -> { System.out.println("You are an adult");}
            case 21 -> { System.out.println("You are more than an adult");}
            case 60 -> { System.out.println("You are a boomer");}
            default -> { System.out.println("hello");}
        }

//        switch(age){
//            case 18:
//                System.out.println("You are an adult");
//                break;
//            case 21:
//                System.out.println("You are more than an adult");
//                break;
//            case 60:
//                System.out.println("You are a boomer");
//                break;
//            default:
//                System.out.println("hello");
//                break;
//        }

        /*
        int age;
        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are experienced.");
        }
        else if(age>46){
            System.out.println("You are semi-experienced.");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced.");
        }
        else{
            System.out.println("You are not experienced.");
        }
         */
    }
}
