class c1{
    public int x =10;
    protected int y = 20;
    int z =30; // default
    private int a =40;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        c1 c =new c1();
        c.meth1();
    }
}
