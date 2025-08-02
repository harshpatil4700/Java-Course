// method invocation : used when you dont write static keyword in method declaration
public class calling_a_method {
    int logic(int x,int y){
        
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        return z;
    }
    
    public static void main(String[] args) {
        int a =5;
        int b= 7;
        int c;
        calling_a_method obj = new calling_a_method();   // object initillization for methods
        c = obj.logic(a,b);                              // method call upon an object
        int a1=2;
        int b1=1;
        int c1;
        c1=obj.logic(a1,b1);                              //method call upon an object
        System.out.println(c);
        System.out.println(c1);
    }
}
