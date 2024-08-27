class MyMainEmployee{
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
    public MyMainEmployee(){
        id = 0;
        name = "Your-name-here";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
}
public class CWH_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee nabila = new MyMainEmployee("sul",60);
        System.out.println(nabila.getId());
        System.out.println(nabila.getName());
    }

}
