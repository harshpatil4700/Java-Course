interface camera{
    void takesnap(); // note:the methods of interfaces are public and abstract methods by default
    void recordvideo();
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
}
public class interfaces_example{
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
    }
}