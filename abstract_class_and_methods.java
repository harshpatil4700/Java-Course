abstract class parent {
    public parent(){
        System.out.println("i am constructor of parent class");
    }
    public void sayhello(){
        System.out.println("hello"); 
    }

    abstract public void greet();
    abstract public void greet1();
}

class child extends parent{   // also called as CONCRETE CLASS
    @Override
    public void greet(){
        System.out.println("good morning");
    }
    @Override
    public void greet1(){
        System.out.println("good night");
    }
}

abstract class child2 extends parent{
    public void saysuii(){
        System.out.println("SUIII");
    }
}

public class abstract_class_and_methods {
    public static void main(String[] args) {
        // parent p = new parent();  error : no objects of abstract class can be created but the class extended i.e inherited
        // child2 c = new child2():           from it can created as done in below step i.e creation of child class
        child c = new child();    // objects of the class inherited by abstract parent class can be created and as it is inherited so the parent() constructor gets run by default
        c.sayhello();
        c.greet();
        c.greet1();
        // to make the function saysuii, you need to make another class extending it and access that function
    }
}
