public class do_while_loop {
    public static void main(String[] args) {
    // to print 1 to 5 using DO-WHILE LOOP   
        int b= 1;
        do { 
            System.out.println(b);
            b++;
        } while (b<=5);

    /*  int a =10;
        do{
            System.out.println(a);
            a++;
        }while(a<5)   ...NO OUTPUT BCOZ 10 IS NOT LESS THAN 5 SO CONDITION OF WHILE LOOP IS FLASE AND HENCE IT DOES NOT EXECUTE THE WHILE LOOP*/
        
    // to print first 100 natural nos:-
    System.out.println("to print first 100 natural numbers:-");
        int c = 1;
        do { 
            System.out.println(c);
            c++;
        } while (c<=100);
    }
}

