interface camera{
    void takesnap(); 
    void recordvideo();
    // void record4Kvideo(); this will give the error in the class implementing this interface as the new method is not included,so maake the new method as default
    default void record4Kvideo(){   // by making default method we need not to add this method in all the classes implementing the interface also you add there and can specify as needed
        System.out.println("recording in 4K");
    }
}
interface wifi{
    String[] getnetwork();
    void connectToNetwork(String network);
}
class myCellphone{
    void callnumber(int phonenumber){
        System.out.println("calling " + phonenumber);
    }
    void pickcall(){
        System.out.println("connecting ");
    }
}
class mysmartphone extends myCellphone implements camera,wifi{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recording video");
    }
    public String[] getnetwork(){
        System.out.println("getting list of networks");
        String[] networklist = {"harsh5g", "hmp4g", "patil"};
        return networklist;
    }
    public void connectToNetwork(String network){
        System.out.println("connecting to "+ network);
    }
    public void record4Kvideo(){  // as we add the default method again in the class also then compiler will run this method
        System.out.println("taking snap and recording in 4K");
    }
}
public class default_methods {
    public static void main(String[] args) {
        mysmartphone s = new mysmartphone();
        String[] a = s.getnetwork();
        for(String item:a){
            System.out.println(item);
        }
        s.callnumber(100);
        s.pickcall();
        s.takesnap();
        s.recordvideo();
        s.connectToNetwork("harsh5G");
        s.record4Kvideo();
    }
}
