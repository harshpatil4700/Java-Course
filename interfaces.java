// another code is present in N.B as example
interface bicycle{
    final int speed = 45;  // can also skip the 'final' keyword as the properties in interfaces are final
    public void applybrake(int decrement);  // note: the interface methods are public by default, Hence here public is redundant i.e even if not written there will be no error 
    void speedup(int increment);
}

interface hornbicycle{
    void blowhornpee();
    void blowhornmild();
}

// class AoneCycle implements bicycle{   
//     void horn(){
//         //code
//     }
// } This will return ana error: either make it as abstracrt class or include the abstract methods of its parent class i.e bicycle

class AoneCycle1 implements bicycle{  //implement of single interface
    void blowhorn(){
        System.out.println("horn sound...");
    }
    public void applybrake(int decrement){
        System.out.println("applying brakes");
    }
    public void speedup(int increment){
        System.out.println("applying speedUP");
    }
}

class AoneCycle implements bicycle, hornbicycle{  //implement of multiple interfaces
    void blowhorn(){
        System.out.println("horn sound...");
    }
    public void applybrake(int decrement){
        System.out.println("applying brakes");
    }
    public void speedup(int increment){
        System.out.println("applying speedUP");
    }
    public void blowhornpee(){
        System.out.println("blowing horn pee pee peee...");
    }
    public void blowhornmild(){
        System.out.println("blowing mild sound horn...");
    }

}

public class interfaces {
    public static void main(String[] args) {
        AoneCycle a = new AoneCycle();
        a.blowhorn();
        a.applybrake(1);
        a.speedup(5);
        System.out.println(a.speed);
        // you can create properties in interfaces 
        // but you cannot modify the properties in interfaces as they are final
        // a.speed=50;  modifying of the properties(variables) of interfaces returns error as they are final i.e like static and cant be modified
        a.blowhornpee();
        a.blowhornmild();

        AoneCycle1 b = new AoneCycle1();
    }
}
