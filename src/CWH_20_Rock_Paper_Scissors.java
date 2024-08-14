import java.util.Random;
import java.util.Scanner;

public class CWH_20_Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rock, paper, scissor;
        rock = 0;
        paper = 1;
        scissor = 2;

        System.out.println("Hi!! \nYou are playing Rock-Paper-Scissors with Computer!!");

        // User input:
        int userInput;
        System.out.println("Enter a number between 0 to 2 [ (0 = Rock),(1 = Paper),(2 = Scissor) ] ");
        userInput = sc.nextInt();

        while (userInput > 2 || userInput<0) {
            System.out.println("Invalid input, Please enter a number between 0 to 2");
            userInput = sc.nextInt();
        }

        //user selections
        if (userInput == rock) {
            System.out.println("User choose ROCK");
        }
        else if (userInput == paper) {
            System.out.println("User choose PAPER");
        }
        else if (userInput == scissor){
                System.out.println("User choose SCISSORS");
        }


        //Computer input:
            int compInput;
            compInput = random.nextInt(3);
            //computer selection
            if (compInput == rock) {
                System.out.println("Computer chose ROCK");
            }
            else if (compInput == paper) {
                System.out.println("Computer choose PAPER");
            }
            else if (compInput == scissor){
                System.out.println("Computer choose SCISSORS");
            }
            // Draw section
            while (userInput == compInput) {
                System.out.println("Its a draw ,try again");
                System.out.println("Enter a number between 0 to 2 [ (0 = Rock),(1 = Paper),(2 = Scissor) ] ");
                userInput = sc.nextInt();
                //user selections
                if (userInput == rock) {
                    System.out.println("User choose ROCK");
                } else if (userInput == paper) {
                    System.out.println("User choose PAPER");
                } else if (userInput == scissor) {
                    System.out.println("User choose SCISSORS");
                }

                compInput = random.nextInt(3);

                //computer selection
                if (compInput == rock) {
                    System.out.println("Computer chose ROCK");
                } else if (compInput == paper) {
                    System.out.println("Computer choose PAPER");
                } else if (compInput == scissor) {
                    System.out.println("Computer choose SCISSORS");
                }
            }


                //-----RESULT-----
        if((userInput == 0 && compInput ==2)  || (userInput ==1 && compInput == 0) || (userInput ==2 || compInput ==1)){
            System.out.println("You win!!");
        }
        else{
            System.out.println("Computer wins ^_^.");
        }

                
    } // main ends
}// class ends



