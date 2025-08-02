class mythreadrunnable1 implements Runnable{
    public void run(){
        for(int i =0;i<150;i++){
            System.out.println("i am thread1");
            i++;
        }
    }
}
class mythreadrunnable2 implements Runnable{
    public void run(){
        for(int i =0;i<150;i++){
            System.out.println("i am thread2");
            i++;
        }
    }
}

public class MultithreadingByRunnableInterface {
    public static void main(String[] args) {
        mythreadrunnable1 bullet1 = new mythreadrunnable1();
        Thread gun1 = new Thread(bullet1);

        mythreadrunnable2 bullet2 = new mythreadrunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
// attends the threads alternatively both (check the outputS)
