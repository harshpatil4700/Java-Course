interface camera{
    void takesnap(); 
    void recordvideo();
    private void greet(){      // private method: only accessible to interface and default methods of the interface
        System.out.println("good morning");
    }
    default void record4Kvideo(){
        greet();
        System.out.println("recording in 4K");
    }
}

class smartphone implements camera{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
}

public class private_methods_in_DefaultMethods {
    public static void main(String[] args) {
        smartphone s = new smartphone();
        s.record4Kvideo();
        // s.greet();  throws an error as private methods cannot be accessed by classes implementing the interface
    }
}
