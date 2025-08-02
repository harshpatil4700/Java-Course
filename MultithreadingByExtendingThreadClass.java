// this is a multithreading done by extending the thread class
class mythread1 extends Thread{  // the thread class is extended
    @Override
    public void run(){
        int i =0;
        while(i<15){
            System.out.println("thread 1 is running");
            System.out.println("i am happy");
            i++;
        }
    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<15){
            System.out.println("thread 2 is running");
            System.out.println("i am sad");
            i++;
        }
    }
}

public class MultithreadingByExtendingThreadClass {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();  // this will execute all the methods of t1 thread but t1.run() will execute only the run() method for t1 
        t2.start();
    }
}
// if we would have not used threads then it would be normal execution i.e execute the mythread1 and then mythread2

