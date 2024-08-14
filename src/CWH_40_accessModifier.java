class MyEmployee{
    private int id;
    private String name;

    public void setId(int n){
        id = n;
    }
    public int getId(){
        return id;
    }
    public void setName(String i){
        name = i;
    }
    public String getName(){
        return name;
    }
}
public class CWH_40_accessModifier {
    public static void main(String[] args) {
        MyEmployee nabila = new MyEmployee();
        nabila.setId(2108060);
        nabila.setName("Eusha");
        System.out.println(nabila.getId());
        System.out.println(nabila.getName());
    }
}
