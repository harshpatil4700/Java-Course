class abc extends Thread{
    public abc(String name){ // constructor
        super(name);
    }
    public void run(){
        System.out.println("I am a thread");
    }
}

public class thread_constructors {
    public static void main(String[] args) {
        abc a = new abc("Harsh");
        abc b = new abc("ram");
        Thread t = new Thread(a);
        t.start();
        a.start();
        b.start();
        System.out.println("the id of the thread is: "+ a.getId());
        System.out.println("the name of the thread is: "+ a.getName());
        System.out.println("the id of the thread is: "+ b.getId());
        System.out.println("the name of the thread is: "+ b.getName());
    }
}
