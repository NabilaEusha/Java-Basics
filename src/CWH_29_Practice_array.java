import java.util.Scanner;

public class CWH_29_Practice_array {

    public static void main(String[] args) {
        /* 1. Create an array of 5 floats and calculate their sum. */
//        float[] num = {3.0f,5f,7f,8,9.3f} ;
//        float sum= 0;
//
//        for(int i = 0;i< num.length; i++){
//            sum = sum+ num[i];
//        }
//        System.out.println("Sum: "+sum);

        /* 2. Write a program to find out whether a given integer is present in an array or not. */

//        int[] num = {2, 1, 0, 8, 4, 6};
//        int n;
//        boolean isInArray = false;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number you want to find: ");
//        n = sc.nextByte();
//        for (int element: num) {
//            if (n == element) {
//               isInArray= true;
//               break;
//            }
//        }
//        if (isInArray == false) {
//            System.out.println("Your given number " + n + " is not present in the array");
//        }
//        else {
//            System.out.println("Your given number " + n + " is present in the array ");
//        }

        /* 3. Calculate the average marks from an array containing marks of all students in physics using for-each loop. */

//        float[] num = {99,87.8f,77.3f,80,90.3f} ;
//        float sum= 0,avg;
//
//        for(float i:num){
//            sum = sum + i;
//        }
//        avg = sum/ num.length;
//        System.out.println("Average marks: "+avg);

        /*  4. Create a java program to add two matrix of size 2 X 3. */

        /*
            matrix direct declare o kora jai

            int[][]  mat1 = {{1, 2, 3},
                             {4, 5, 6}}
            int[][]  mat2 = {{2, 6, 13},
                             {3, 7, 1}}
        */
//        int[][] a = new int[2][3];
//        int[][] b = new int[2][3];
//        int[][] c = new int[2][3];
//
//        Scanner sc = new Scanner(System.in);
//        int n;

//        System.out.print("Enter the elements of first matrix A: ");
//        for(int i = 0;i< a.length; i++){
//            for (int j = 0; j<a[i].length; j++){
//               n= sc.nextInt();
//               a[i][j]= n;
//            }
//        }
//
//        System.out.print("Enter the elements of first matrix B: ");
//        for(int i = 0;i< b.length; i++){
//            for (int j = 0; j<b[i].length; j++){
//                n= sc.nextInt();
//                b[i][j]= n;
//            }
//        }
//        System.out.println("Sum of the matrix is: ");
//        for (int i = 0; i<a.length; i++){
//            for (int j = 0; j<a[i].length; j++){
//                c[i][j] = a[i][j] + b[i][j];
//                System.out.print(c[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }



        /* 5. Write a java program to reverse an array. */
//        int [] arr = {1,2,3,4,5,6,7};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//
//        for (int i=0; i<n ;i++){
//            // swap arr[i] and arr[l-1-i]
//            // a    b    temp
//            // |3|  |4|  ||
//            temp = arr[i];
//            arr[i]= arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//
//        for (int element: arr){
//            System.out.print(element+ " ");
//        }


        /* 6. Write a Java program to find the maximum element in an array. */

//        int [] arr = {1,2,3,4, 677,5,6,7};
//        int max = 0;
//
//        for (int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//
//        System.out.println("The maximum value of element is: "+max);
//        // Java te by default maximum minimum value ache
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

        /* 7. Write a java program to find the minimum element in a java array. */

//        int [] arr = {2,3,4, 677,5,2,1,6,7};
//          //int min = arr[0];
//          int min = Integer.MAX_VALUE;
//
//        for (int e: arr){
//            if(e<min){
//                min = e;
//            }
//        }
//
//        System.out.println("The minimum value of element is: "+min);

        /* 8. Write a java program to find whether an array is sorted or not. */

        int [] arr = {2,3,4, 677,5,2,1,6,7};
        boolean isSorted = true;
        for (int i = 0; i< arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }

        if(isSorted){
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted.");
        }

    }
}





