interface sampleInterface{
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class MySampleClass implements childSampleInterface{
    public void meth1(){
        System.out.println("Meth 1 ");
    }
    public void meth2(){
        System.out.println("Meth 2 ");
    }
    public void meth3(){
        System.out.println("Meth 3 ");
    }
    public void meth4(){
        System.out.println("Meth 4 ");
    }
}
public class CWH_58_interface_inheritance {
    public static void main(String[] args) {
       MySampleClass my = new MySampleClass();

        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}
