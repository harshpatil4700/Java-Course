public class break_keyword {
    public static void main(String[] args) {

        // break using for loop
        for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("java is gr8");
            if (i==2){
                System.out.println("ending the loop");
                break;         // after i=2 it will exit the for loop and go to next statement 
            }
        System.out.println("loop ends here");
        }
    

        // break using while loop
        int j=0;
        while(j<5){
            System.out.println(j);
            System.out.println("java is gr8");
            if (j==2){
                System.out.println("ending the loop");
                break;
            }
            j++;
        System.out.println("loop ends here");
        }

        // break using do while loop
        int k=0;
        do{
            System.out.println(k);
            System.out.println("java is gr8");
            if (k==2){
                System.out.println("ending the loop");
                break;
            }
            k++;
        }while(k<5);
        System.out.println("loop ends here");
    }
}

