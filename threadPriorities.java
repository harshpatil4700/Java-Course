class mythread extends Thread{
    public mythread(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you "+ this.getName());
    }
}

public class threadPriorities {
    public static void main(String[] args) {
        mythread t1 = new mythread("harsh1");
        mythread t2 = new mythread("harsh2");
        mythread t3 = new mythread("harsh3");
        mythread t4 = new mythread("harsh4");
        mythread t5 = new mythread("harsh5");
        // t1.start();
        // t2.start();
        // t3.start();
        // t4.start();
        // t5.start();
        // when we run this it executes in a random order to get in a specific order we can assign priority to threads (can view by uncommenting it)
        
        t5.setPriority(Thread.MAX_PRIORITY); // highest priority
        t1.setPriority(Thread.MIN_PRIORITY);  // lowest priority
        t3.setPriority(Thread.MIN_PRIORITY);  // lowest priority
        // note that thread with no priority i.e default priority has normal priority
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
