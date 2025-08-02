class mythread1 extends Thread{  
    @Override
    public void run(){
        int i =0;
        while(i<2){
            System.out.println("thread 1 is running");
            System.out.println("i am happy");
            try {
                Thread.sleep(455);  //when this command is run the next iteration is carried out after every 455 milliseconds
            } 
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            i++;
        }
    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<2){
            System.out.println("thread 2 is running");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class threadMethods {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        try {
            t1.join();   // executes the t1 thread first and after complete execution of t1 then only starts execution of thread t2
        }
        catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}
// search thread methods in java