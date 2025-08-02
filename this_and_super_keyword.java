class myfun{
    int a;
    myfun(int a){
        this.a=a;
        //a=a;  this will give an error or will not be able to set value for a and set a as 0
    }

    public int get_a(){
        return a;
    }
}

class fun1 extends myfun{
    fun1(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}
public class this_and_super_keyword {
    public static void main(String[] args) {
        myfun m = new myfun(5);
        fun1 f =new fun1(93);
        System.out.println(m.get_a());
        System.out.println(f.get_a());
    }
}
