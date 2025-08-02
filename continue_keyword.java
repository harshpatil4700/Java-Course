public class continue_keyword {
    public static void main(String[] args) {
        // continue using FOR LOOP:-
        for (int i=0;i<10;i++){
            System.out.println("starting the loop");
            if (i==2){
                System.out.println("will ignore the statement for 2 aand go to next iteration i.e 3");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }

        // continue using DO WHILE LOOP:-
        System.out.println("---------------------------------------------------------");
        int j=0;
        do{
            j++;
            if (j==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is gr8");
        }while(j<5);
        System.out.println("loop ends here");

        // continue using WHILE LOOP:-
        System.out.println("---------------------------------------------------------");
        int k=0;
        while(k<5){
            System.out.println("starting the loop");
            k++;
            if (k==2){
                System.out.println("this is case for 2");
                continue;
            }
            System.out.println(k);
            System.out.println("java is gr8");
            System.out.println("loop ends here");
        }
    }
}
