class rectangle{
    public int l;
    public int b;
    public int h;
    public void set_l_b_and_h(int a, int c,int d){
        this.l=a;
        this.b=c;
        this.h=d;
    }
    public int  getl(){
        return l;
    }   
    public int  getb(){
        return b;
    }   
    public int  geth(){
        return h;
    }   
    public int area(){
        return l*b;
    }
    public int volume(){
        return l*b*h;
    }
}

class cuboid extends rectangle{
    public int area(){
        return 2*(l*b+b*h+l*h);
    }
    public int volume(){
        return l*b*h;
    }
}

public class PS10Q4 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.set_l_b_and_h(5, 10, 15);
        System.out.println("the area of the rectangle is: "+r.area());
        System.out.println("the volume of the rectangle is: "+r.volume());

        cuboid c =new cuboid();
        c.set_l_b_and_h(5, 10, 15);
        System.out.println("the area of the cuboid is: "+c.area());
        System.out.println("the volume of the cuboid is: "+c.volume());
    }
}
