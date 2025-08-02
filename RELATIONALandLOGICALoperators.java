public class RELATIONALandLOGICALoperators {
    public static void main(String[] args){
        // Logical AND
        boolean a = true;
        boolean b = true;
        boolean e = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a && b);   
        System.out.println(a && c);
        System.out.println(c && a);
        System.out.println(c && d);

        if(a && c){
            System.out.println("T");
        }
        else{
            System.out.println("F");
        }

        System.out.println(a&&b&&e);  // t bcoz all are tue
        System.out.println(a&&b&&c);  // F bcoz c is false 

        // logical OR
        System.out.println(a || b);   
        System.out.println(a || c);
        System.out.println(c || a);
        System.out.println(c || d);

        if(a || c){
            System.out.println("T");
        }
        else{
            System.out.println("F");
        }

        // logical NOT
        System.out.println("not(a) is : " + !a);
        System.out.println("not(b) is : " + !b);
        System.out.println("not(c) is : " + !c);
        System.out.println(!a && !c);
    }
}


