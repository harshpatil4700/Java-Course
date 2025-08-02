class A{
    public int a;
    public int myfun(){
        return 5;
    }
    public void meth2(){
        System.out.println("i am method 2 of class a");
    }
}

class B extends A{
    @Override  // this annotation gives warning if the overrifding is not done 
    public void meth2(){     // overriding of meth2 here,to specidy the meth2 is 2nd method of respective class
        System.out.println("i am method 2 of class b");
    }
    public void meth3(){
        System.out.println("i am method 3 of class a");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();
        B b =new B();
        b.meth2();
    }
}
