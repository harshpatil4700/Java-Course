interface sampleinterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleinterface{
    void meth3();
    void meth4();
}  // it also includes meth1 and meth2 by inheritance

class sampleclass implements childSampleInterface{
    public void meth3(){
        System.out.println("meth3");
    }
    public void meth4(){
        System.out.println("meth4");
    } // here,still class has error that either add meth1 and meth2 or make class as abstract class
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");
    } 
}

public class inheritance_in_interfaces {
    public static void main(String[] args) {
        sampleclass s = new sampleclass();
        s.meth1();
        s.meth2();
        s.meth3();
        s.meth4();
    }
}
