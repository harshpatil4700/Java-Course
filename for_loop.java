public class for_loop {
    public static void main(String[] args) {
        // to print 1 to 10:
        for(int i =1; i<=10; i++){
            System.out.println(i);
        }

        /* false or wrong for loop
        in case of INCREMENTING FOR LOOP:-            in case of DECREMENTING FOR LOOP:- 
        for(int i =1; i<=0; i++){                     for(int i =10; i<=0; i++){ 
            System.out.println(i);                       System.out.println(i);
        }                                             }   */

        // to print first 5 odd numbers:-
        System.out.println("first 5 odd numbers:-");
        int n =5;
        for(int i =0; i<=n; i++){
            System.out.println(2*i+1);
        }

        System.out.println("decrementing for loop");
        for(int h =5; h!=0;h--){    // instead of h!=0 you can also use h<0 (it is just an alternative)
            System.out.println(h); 
        }

        //quick quiz:- print 10 even numbers in reverse order
        System.out.println("to print 10 even numbers in reverse order");
        int n1=10;
        for (int z = 10; z>0; z--){    // >0 is used bcoz 0 is a whole no.
            System.out.println(2*z);
        }
    }
}
