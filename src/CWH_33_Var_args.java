public class CWH_33_Var_args {

//    static int sum(int a , int b){
//        return a+b;
//    }
//    static int sum(int a , int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a , int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int x,int...arr){
        // Available as int[] arr;
        int result = x;
        for (int a: arr){
            result += a;
        }
        return result;

    }

    public static void main(String[] args) {
//        System.out.println("The sum of Nothing is: "+sum());//arguments deya compulsory na jodi 'int x' method e na likhi
        System.out.println("The sum of 4,3 is: "+sum(4,3));
        System.out.println("The sum of 4,3,5 is: "+sum(4,3,5));
        System.out.println("The sum of 4,3,6,7 is: "+sum(4,3,6,7));
        System.out.println("The sum of 4,3,6,7,10,18,16,17 is: "+sum(4,3,6,7,10,18,16,17));
    }
}
