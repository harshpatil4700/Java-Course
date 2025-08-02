interface BasicAnimal{
    void eat();
    void sleep();
}

class monkey {
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}
class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void walkNtalk(){
        System.out.println("walk and talk");
    }
}
public class PS11Q5 {
    public static void main(String[] args) {
        monkey m = new human();
        m.jump();
        m.bite();

        BasicAnimal b = new human();
        b.eat();
        b.sleep();
        
        human h = new human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
        h.walkNtalk();
    }
}
