/*
Write a program to calculate percentage of a given student
in CBSE exam.His marks for, 5 subjects must be taken as
input from the keyboard (marks are out of 100)
 */
import java.util.Scanner;
public class CWH_06_exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1: ");
        float s1 = sc.nextFloat();
        System.out.print("Enter the marks of subject 2: ");
        float s2 = sc.nextFloat();
        System.out.print("Enter the marks of subject 3: ");
        float s3 = sc.nextFloat();
        System.out.print("Enter the marks of subject 4: ");
        float s4 = sc.nextFloat();
        System.out.print("Enter the marks of subject 5: ");
        float s5 = sc.nextFloat();

        float percentage = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Percentage: "+percentage);

    }
}
