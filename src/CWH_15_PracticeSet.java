public class CWH_15_PracticeSet {
    public static void main(String[] args) {
        /* Write a Java Program to convert a string to lowercase. */

        String name =" Nabila Sultana ";
        System.out.println(name.toLowerCase());

        /* Write a Java Program to replace spaces with underscores. */

        System.out.println(name.replace(" ","_"));

        /* Write a Java Program to replace name in a letter template. */

        String letter = "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Nabila"));

        /* Write a Java Program to detect double and triple spaces in a string. */

        String myString = "This string contains  double and   triple spaces";
        System.out.println("Index of double space: "+myString.indexOf("  "));
        System.out.println("Index of triple space: "+myString.indexOf("   "));

        /* Write a Java Program to write with escape sequence. */

        String es = "\"Dear Harry,\n\t This course is nice.\nThanks!\" ";
        System.out.println(es);

    }
}
