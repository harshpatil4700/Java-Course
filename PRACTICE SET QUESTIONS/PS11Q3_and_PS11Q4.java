// PS11Q3:-
// interface basicAnimal{
//     void eat();
//     void sleep();
// }

// class monkey {
//     void jump(){
//         System.out.println("jumping");
//     }
//     void bite(){
//         System.out.println("biting");
//     }
// }

// class human extends monkey implements basicAnimal{
//     public void speak(){
//         System.out.println("hello sir!");
//     }
//     public void eat(){
//         System.out.println("eating");
//     }
//     public void sleep(){
//         System.out.println("sleeping");
//     }
// }
// public class PS11Q3 {
//     public static void main(String[] args) {
//         human h = new human();
//         h.eat();
//         h.sleep();
//         h.jump();
//         h.bite();
//         h.speak();
//     }
// }


// PS11Q4:- polymorphism
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class smartphone extends telephone{
    public void ring(){
        System.out.println("ringing");
    }
    public void lift(){
        System.out.println("connecting");
    }
    public void disconnect(){
        System.out.println("disconnecting");
    }
    public void camera(){
        System.out.println("capturing image");
    }
    public void musicPlayer(){
        System.out.println("playing a music");
    }
}

public class PS11Q3_and_PS11Q4 {
    public static void main(String[] args) {
        telephone t = new smartphone();
        t.ring();
        t.lift();
        t.disconnect();
        // t.camera();  t.musicPlayer();  gives the error as the methods are not accessible to them

        smartphone s = new smartphone();
        s.camera();
        s.musicPlayer();
    }
}