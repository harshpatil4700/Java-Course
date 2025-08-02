class cylinder{
    private int r;
    private int h;

    public int getradius(){
        return r;
    }
    public void setradius(int r){
        this.r=r;
    }
    
    public int getheight(){
        return h;
    }
    public void setheight(int h){
        this.h=h;
    }

    public double surfacearea(){
        return 2*Math.PI*r*r + 2*3.14*r*h;
    }
    public double surfacearea(int r){   // constructor for surface area where radius is different with same height
        return 2*Math.PI*r*r + 2*3.14*r*h;
    }

    public double volume(){
        return 2*Math.PI*r*r*h;
    }
    public double volume(int h){   // constructor for volume where radius is different with same height
        return 2*Math.PI*r*r*h;
    }
}

public class PS9Q1andPS9Q2 {
    public static void main(String[] args) {
        cylinder c= new cylinder();
        c.setradius(10);
        System.out.println("radius of cylinder: "+c.getradius());
        c.setheight(20);
        System.out.println("height of cylinder: "+c.getheight());
        System.out.println("surface area of cylinder: "+c.surfacearea());
        System.out.println("surface area of cylinder: "+c.surfacearea(25));
        System.out.println("volume of cylinder: "+c.volume());
        System.out.println("volume of cylinder: "+c.volume(7));

    }
}
