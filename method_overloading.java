public class method_overloading {
    static void foo(){
        System.out.println("weight of being an average is heavier than weight of waking up early! ");
    }
    
    static void foo(int a){
        System.out.println("you have entered "+ a +" number");
    }

    static void foo(int a,int b){
        int p =a*b;
        System.out.println("the product of two nos. is: "+ p);
    }
    
    public static void main(String[] args) {
        foo();
        foo(7);
        foo(10,5);
    }
}
/*

static void fun(int a){
    sysout(a);
}

static int fun(int a){
    sysout("hello"+a);
}

this will give an ERROR: the method fun(int a) is already declared in the class
explaination : here the method fun has same parameters and same name and only diff ret typr(void & int)this causes 
an error . to avoid it change the parameters(method overloading) or change the method name of any one method and run
them seperately in main() method   
 */