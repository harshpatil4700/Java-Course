class cylinder{     //PS9Q3
    int r;
    int h;
    public cylinder(){
        r=5;
        h=10;
    }
    public int  getradius(){return r;}
    public void setname(int r1){this.r=r1;}
    public int getheight(){return h;}
    public void setheight(int h1){this.h=h1;}
}

class rectangle{     //PS9Q4
    int l;
    int b;
    public rectangle(){
        l=4;
        b=5;
    }
    public int getlength(){
        return l;
    }
    public void setlength(int l){
        this.l=l;
    }
    
    public int getbreadth(){
        return b;
    }
    public void setbreadth(int b){
        this.b=b;
    }
}
public class PS9Q3andPS9Q4 {
    public static void main(String[] args) {
        //PS9Q3:-cylinder
        cylinder c =new cylinder();
        System.out.println(c.getradius());
        System.out.println(c.getheight());

        //PS9Q4:-rectangle
        rectangle r= new rectangle();
        System.out.println(r.getlength());
        System.out.println(r.getbreadth());
    }
}
