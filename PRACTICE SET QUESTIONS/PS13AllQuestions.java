class greet1 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class greet2 extends Thread{
    public void run(){
        while(true){
            try {
                Thread.sleep(200000000);
            } 
            catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Welcome");
        }
    }
}

public class PS13AllQuestions {
    public static void main(String[] args) {
        greet1 g1 = new greet1();
        g1.setPriority(6);   // Q3

        greet2 g2 = new greet2();
        g2.setPriority(9);
        greet2 g3 = new greet2();  // no priority set so returns 5 for get prio. as it has deafult i.e normal priority

        System.out.println(g1.getPriority());  // Q3
        System.out.println(g2.getPriority());
        System.out.println(g3.getPriority());
        
        System.out.println(g1.getState());  // Q4: will ret new as g1 is yet to be execute

        g1.start();
        g2.start();

        System.out.println(g1.getState());  // Q4: will ret running as g1 is being executed

        System.out.println(Thread.currentThread().getState());  // Q5: to get reference to current thread
    }
}
