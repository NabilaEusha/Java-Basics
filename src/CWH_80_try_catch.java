public class CWH_80_try_catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Without try:
//        int c = a/b;
//        System.out.println(c);
        // With try:
        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception k){
            System.out.println("We failed to divide. Reason: "+k);
        }
        System.out.println("End of the program");
    }
}
