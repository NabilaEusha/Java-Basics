class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is: "+id);
        System.out.println("and my name is: "+name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CWH_38_custom_class {
    public static void main(String[] args) {
        Employee nabila = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee();

        //Setting attributes for nabila
        nabila.id = 2108060;
        nabila.name = "Eusha";
        nabila.salary = 50;

        //Setting attributes for john
        john.id= 46;
        john.name="kader";
        john.salary = 60;

        // Printing the attributes
        nabila.printDetails();
        john.printDetails();

        System.out.println(john.getSalary());
//        System.out.println(nabila.name);
//        System.out.println(nabila.id);
    }
}
