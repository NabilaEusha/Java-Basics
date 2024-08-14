public class CWH_34_Recursion {

    static int factorial(int a){
        if(a==1 || a==0){
            return 1;
        }
        else{
            return a* factorial(a-1);
        }
    }

    static int factorial_iterative(int a){
        if(a==1 || a==0){
            return 1;
        }
        else{
            int product = 1;
            for (int i = 1; i<=a; i++){
                product *= i;
            }
            return product;
        }
    }

    static int fib(int n){
        if(n<=0){
            return  -1;
        }
        else if (n==1) {
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("factorial of 4 is: "+ factorial(n));
        System.out.println("factorial of 4 is: "+ factorial_iterative(n));

        System.out.println("fibonacci sum of 4: "+ fib(n));
    }
}
