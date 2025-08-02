public class PS7Q2 {
    static void pattern (int n){
        for(int i=0;i<n;i++){         // no. of rows
            for(int j=0;j<i+1;j++){   // no.of columns and i+1 to print extra one * at end of each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
