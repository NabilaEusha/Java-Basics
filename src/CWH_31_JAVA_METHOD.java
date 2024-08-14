public class CWH_31_JAVA_METHOD {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z = x+y;
        }
        else {
            z= (x+y) *5;
        }
        return z;
    }
    int Sum(int a,int b){
        int c;
        c= a+b;
        return c;
    }
    public static void main(String[] args) {
        int a = 5, b=6;
        int c = logic(a,b);
        System.out.println(c);
        //Method invocation using Object creation
        CWH_31_JAVA_METHOD obj= new CWH_31_JAVA_METHOD();
        int x= obj.Sum(a,b);
        System.out.println("Sum: "+x);

    }
}
