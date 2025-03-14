
import java.util.Random;
import java.util.Scanner;

class guessNum{
   private int num;
   private int n, noOfGuesses=0;
    Scanner sc = new Scanner(System.in);

    public guessNum(){
        Random random = new Random();
        num = random.nextInt(100);
        takeInput();
    }
    public void takeInput(){
        System.out.print("Guess a number: ");
        int i = sc.nextInt();
        n = i;
        noOfGuesses++;
        isCorrect();
    }

    public void isCorrect(){
        if(num == n){
            System.out.println("you guessed the number on your guess no "+noOfGuesses+" ! Congratulations!!");
        }
        else if(num > n){
            System.out.println("The number is higher! Guess again!");
            takeInput();
        }
        else if(num < n){
            System.out.println("The number is lower! Guess again!");
            takeInput();
        }
}
}

public class CWH_43_GuessTheNum {
    public static void main(String[] args) {
        /*
        Create a game which allows user to play "guess the number" game once.
        Game should have the following methods:

        1. Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered ny the user is true
        4. getter and setter for the noOfGuesses
        use properties such as noOfGuesses(int),etc to get this task done
         */

       guessNum nabila = new guessNum();

    }
}

/*package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class cwh_50_ex3sol {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

