public class while_loops {
    public static void main(String[] args) {
        // to print 1 to 5 using WHILE LOOP
        int i =1;
        while (i<=5){
            System.out.println(i);
            i++;   // it increments till i = 5 but at i = 6 condition fails so it stops execution of printing 'i'
            
        }
    System.out.println("successfully printed 1 to 5");

        /* INFINTE LOOP
        int i1=1;
        while (true){   
            System.out.println(i1);
            i1++;  */
        
    // QUICK QUIZ:- write a pgm to print num from 100 to 200
        int j = 100;
        while(j<201){
            System.out.println(j);
            j++;
    }    
    }
}