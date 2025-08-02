public class methods {
    static int logic(int x,int y){
    //int logic(int x,int y){   cant be run without static keyword or it gives an error as non static method cannot be referenced
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
        x=4700;   // to show that modification in vars of method () function does not affect vars in main () function/main() method
        y=4701;   // to show that modification in vars of method () function does not affect vars in main () function/main() method
        return z;
    }

    public static void main(String[] args) {
        int a =5;
        int b= 7;
        int c;
        c = logic(a,b);       // a<b so else loop will run
        int a1=2;
        int b1=1;
        int c1;
        c1=logic(a1,b1);       // a>b so if loop will run
        System.out.println(c);
        System.out.println(c1);

        // TO CALCULATE AVERAGE OF 2 NOS BY METHODS 
        // static int average1(int m,int n){
        //     int c= (m+n)/2;
        //     return c;
        // }
        // public static void main(String[] args) {
        //     int c= average1(10,20);
        //     System.out.println(c);
        // }
    }
}

