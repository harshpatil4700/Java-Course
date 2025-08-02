interface tvRemote{
    void switchon_off();
    void volumeUp(int volume);
    void volumeDown(int volume);
}
interface SmartTVRemote extends tvRemote{
    void changechannel(int channel);
    void guide();
    void voiceControl(String command);
}

class SmartTV implements SmartTVRemote{
    public void switchon_off(){
        System.out.println("TV is switched On and OFF");
    }
    public void volumeUp(int volume){
        System.out.println("volume is increased to " + volume);
    }
    public void volumeDown(int volume){
        System.out.println("volume is decreased to " + volume);
    }
    public void changechannel(int channel){
        System.out.println("channel is changed to " + channel);
    }
    public void guide(){
        System.out.println("channel searching");
    }
    public void voiceControl(String command){
        System.out.println("volume is recorded and processed " + command);
    }
}

class smartTV2 implements tvRemote{  // for PS11Q7
    public void switchon_off(){
        System.out.println("tv is switched on and off");
    }
    public void volumeUp(int volume){
        System.out.println("volume of tv increased to "+ volume);
    }
    public void volumeDown(int volume){
        System.out.println("volume of tv decreased to "+ volume);
    }
}

public class PS11Q6_and_PS11Q7 {
    public static void main(String[] args) {
        //PS11Q6
        SmartTV s = new SmartTV();
        s.switchon_off();
        s.volumeDown(5);
        s.volumeUp(10);
        s.changechannel(4700);
        s.guide();
        s.voiceControl("open youtube");

        //PS11Q7
        smartTV2 h = new smartTV2();
        h.switchon_off();
        h.volumeDown(5);
        h.volumeUp(10);
    }
}
