abstract class pen{
    abstract public void write();
    abstract public void refill();
}

class fountainPen extends pen{
    public void write(){
        System.out.println("writing...");
    }
    public void refill(){
        System.out.println("refilling...");
    }
    public void changeNib(){
        System.out.println("changing the nib");
    }
}

public class PS11Q1_and_PS11Q2 {
    public static void main(String[] args) {
        fountainPen f = new fountainPen();
        f.write();
        f.refill();
        f.changeNib();
    }
}