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

        while (userInput > 2) {
            System.out.println("Invalid input, Please enter a number between 0 to 2");
            userInput = sc.nextInt();
        }

        //user selections
        if (userInput == rock) {
            System.out.println("User chose ROCK");
        }
        else {
            if (userInput == paper) {
                System.out.println("User chose PAPER");
            } else {
                System.out.println("User chose SCISSORS");
            }
        }

            //Computer input:
            int compInput;
            compInput = random.nextInt(3);
            //computer selection
            if (compInput == rock) {
                System.out.println("Computer chose ROCK");
            }
            else {
                if (compInput == paper) {
                    System.out.println("Computer chose PAPER");
                } else {
                    System.out.println("Computer chose SCISSORS");
                }
            }
            // Draw section
            while (userInput == compInput) {
                System.out.println("Its a draw ,try again");
                System.out.println("Enter a number between 0 to 2 [ (0 = Rock),(1 = Paper),(2 = Scissor) ] ");
                userInput = sc.nextInt();
                //user selections
                if (userInput == rock) {
                    System.out.println("User chose ROCK");
                } else {
                    if (userInput == paper) {
                        System.out.println("User chose PAPER");
                    } else {
                        System.out.println("User chose SCISSORS");
                    }
                }

                    compInput = random.nextInt(3);

                    //computer selection
                    if (compInput == rock) {
                        System.out.println("Computer chose ROCK");
                    } else {
                        if (compInput == paper) {
                            System.out.println("Computer chose PAPER");
                        } else {
                            System.out.println("Computer chose SCISSORS");
                        }
                    }
                }


                //-----RESULT-----

                if (compInput == rock) {
                    if (userInput == paper) {
                        System.out.println("You win!!");
                    } else {
                        System.out.println("Computer wins ^_^.");
                    }
                } else if (compInput == paper) {
                    if (userInput == rock) {
                        System.out.println("Computer wins ^_^.");
                    } else {
                        System.out.println("You win!!");
                    }
                } else if (compInput == scissor) {
                    if (userInput == paper) {
                        System.out.println("Computer wins ^_^.");
                    } else {
                        System.out.println("You win!!");
                    }
                }
                
    } // main ends
}// class ends



