class base{
    int x;

    public void setx(int x){
        System.out.println("i am in base class and setting the val of x");
        this.x=x;
    }

    public int getx(){
        return x;
    }
}

class derived extends base{  // declaring inheritance:-now,derived class has all properties and methods of base class
    int y;
    
    public void  sety(int y){
        System.out.println("i am in derived class and setting the val of y");
        this.y=y;
    }

    public int gety(){
        return y;
    }
}

public class inheritance {
    public static void main(String[] args) {
        base b= new base();
        b.setx(10);
        System.out.println(b.getx());   // this will return x value as 10

        // b.sety(15); THIS GIVES AN ERROR AS WE CANNOT ACCESS THE y(derived class property) WITH THE BASE CLASS
        // System.out.println(b.gety());

        derived d = new derived();    // this is inheritance ,here we accessed the properties and methods of base class (x,setx,getx) by derived class
        d.setx(20);
        System.out.println(d.getx());  // the value 20 overites the value 10 set bt base class and return it
        
        d.sety(91);
        System.out.println(d.gety());
    }
}


// quick quiz:
// class Animal {
//     String name;
//     int age;

//     public Animal(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public void speak() {
//         System.out.println("The animal makes a sound.");
//     }
// }

// class Dog extends Animal {

//     public Dog(String name, int age) {
//         super(name, age);
//     }

//     public void speak() {
//         System.out.println("The dog barks.");
//     }

//     public void fetch() {
//         System.out.println("The dog is fetching the ball.");
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
//         Dog myDog = new Dog("chittu", 3);
//         System.out.println("Dog's name: " + myDog.name);
//         System.out.println("Dog's age: " + myDog.age);
//         myDog.speak();
//         myDog.fetch();
//     }
// }
