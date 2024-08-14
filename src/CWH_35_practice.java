public class CWH_35_practice {
    //1. Write a java method to print multiplication table of a number n.
    static void multiplication(int n){
        for (int i = 0; i<=n;i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    /* 2. Write a program using functions to print the following pattern
    *
    * *
    * * *
    * * * *
    */

    static void pattern1(int n){
        for (int i = 1; i<=n;i++){
            for (int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Write a recursive function to calculate sum of first n natural numbers.

    static int sum(int n){
        if(n==1){
            return 1;
        }
        else {
            return n+sum(n-1);
        }
    }

    /* 4. Write a program using functions to print the following pattern
     * * * *
     * * *
     * *
     *
     */

        static void pattern2(int n){
        for (int i = n; i>=1;i--){
            for (int j = i; j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 5. Write a function to print nth term of fibonacci series using recursion.

    static int fib(int n){
       /* if(n==1){
            return 0;
        }
        else if (n==2) {
         return 1;
        }
        */
        if(n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    // 6. Write a function to find average of a set of numbers passed as arguments.
    static void avg(int...arr){
        int sum = 0;
        int length = arr.length;
        for (int i:arr){
            sum+=i;
        }
        float avg = sum/length;
        System.out.println(avg);
    }

    // 7.Solve p2 using recursion

    static void pattern1_rec(int n){
            if(n>0){
                pattern1_rec(n-1);
                for (int i = 0; i<n;i++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
    //pattern1_rec(4)
    //pattern1_rec(3) + 4 times star and a new line
    //pattern1_rec(2) + 3 times star and a new line + 4 times star and a new line
    //pattern1_rec(1) + 2 times star and a new line + 3 times star and a new line + 4 times star and a new line
    //pattern1_rec(0) + 1 times star and a new line + 2 times star and a new line + 3 times star and a new line + 4 times star and a new line

    // 8.Solve p4 using recursion
    static void pattern2_rec(int n){
        if(n>0){

            for (int i = 0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n-1);
        }
    }



    public static void main(String[] args) {
        // p1
//        multiplication(9);

        //p2
//        pattern1(9);

        //p3
//        int c =sum(5);
//        System.out.println(c);

        //p4
//        pattern2(4);

        //p5
//        int result = fib(7);
//        System.out.println(result);

        //p6
//        avg(1,2,3,4,5);

        //p7
//        pattern1_rec(4);

        //p8
        pattern2_rec(4);
    }

}
