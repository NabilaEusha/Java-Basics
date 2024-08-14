public class CWH_26_arrays {
    public static void main(String[] args) {
        /* ways to create array in java */
        // 1. Declaration and memory allocation
//        int[] marks = new int[5];

        // 2. Declaration and then memory allocation
        int[] marks ;
        marks = new int[5];
        // Initialization
        marks[0] = 100;
        marks[1] = 50;
        marks[2] = 30;
        marks[3] = 10;
        marks[4] = 60;

//        System.out.println(marks[3]);

        // Displaying the array(w/ for loop)

//        System.out.println("Printing using for loop: ");
//        for(int i = 0 ; i< marks.length; i++){
//            System.out.println(marks[i]);
//        }
//
//        System.out.println("Printing using for loop in reverse order: ");
//        for(int i = marks.length - 1 ; i>=0 ; i--){
//            System.out.println(marks[i]);
//        }
        System.out.println("Printing using for-each loop: ");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
