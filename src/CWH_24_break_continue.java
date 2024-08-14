public class CWH_24_break_continue {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

        // ---------CONTINUE-------
/*
        for(int i = 0; i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

 */
        /*
        int i = 0;
        do{
            i++;
          if(i==2){
              System.out.println("Ending the loop");
              continue;
          }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here !! ");

         */
    }
}
