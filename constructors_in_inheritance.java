class base{
    base(){
        System.out.println("i am a base class constructor");
    }
    base(int a){
        System.out.println("i am overloaded constructor with value of a as: "+a);
    }
}

class derived extends base{
    derived(){
        System.out.println("i am derived class constructor");
    }
    derived(int a,int b){
        super(a);   // this call will take compiler to super(parent) class to execute the base class constructor with value of a
        System.out.println("i am overloaded constructor with value of a as: "+ a + " and " + b);
    }
}

class childofderived extends derived{
    childofderived() {
        System.out.println(" i am childofderived class constructor");
    }
    childofderived(int a,int b,int c) {
        super(a,b);// this call will go to derived class constructor which has a and b and execute that constructor
        System.out.println(" i am childofderived class constructor with value of c as: "+c);
    }
    
}

// class derived1 extends derived{   *** UNCOMMENT IT TO VIEW INHERITANCE OF CONSTRUCTORS IN 3 CLASSES ****
//     derived1(){
//         System.out.println("i am derived1 class constructor");
//     }
// }

public class constructors_in_inheritance {
    public static void main(String[] args) {
        base b = new base();  // WKT,as soon as objcet is created constructor is invoked
        derived d = new derived();  // accessess the base class constructor first and then derived class constructor is invoked
        //derived d1 = new derived1();  // accessess the base class constructor first then derived class constructor is invoked and then constructor of itself is invoked
        derived d1 = new derived(5,10);
        childofderived cd = new childofderived();  // calls base ,derived and self class constructors which have no arguments
        childofderived cd1 = new childofderived(10,15,20);
    }
}
