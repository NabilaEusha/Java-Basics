import java.util.Locale;

public class CWH_14_String_Methods {
    public static void main(String[] args) {

        String name = "Happy Birthday";
        String namespace = "      H    appy Birthday     ";
        int l = name.length();
        System.out.println("String length: "+l);

        String lr = name.toLowerCase();
        System.out.println("String in lower case: "+lr);

        String ur = name.toUpperCase();
        System.out.println("String in upper case: "+ur);

        System.out.println("String after trimming leading and trailing spaces: "+namespace.trim());

        System.out.println("string after index 11: "+name.substring(11));
        System.out.println("string between index 10 to 22: "+name.substring(10,13));

        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("ppy","ier"));

        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println("Character at index 2: "+name.charAt(2));
        System.out.println("Index of character 'ap' : "+name.indexOf("ap"));

        System.out.println("----------------------------");
        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry54747"));            // na paile -1 return korbe
        System.out.println(modifiedName.indexOf("rry",4));
        System.out.println(modifiedName.lastIndexOf("r"));           //back theke search kore
        System.out.println(modifiedName.lastIndexOf("r",4));

//        System.out.println(modifiedName.equals("Harryrry"));
        System.out.println(modifiedName.equals("harryrry"));             // case sensitive

        System.out.println(modifiedName.equalsIgnoreCase("HARryRRY"));

        System.out.println("I am escape sequences \" hi ");
    }
}
