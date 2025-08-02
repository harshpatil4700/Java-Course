public class multidimensional_arrays {
    public static void main(String[] args) {
        int [] marks = new int [5];    // 1-D array
        int [][] flats = new int [2][3];   // 2-D array
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        char [][] name = new char[2][2];   // 3d array
        name[0][0] ='A';
        name[0][1] ='b';
        name[1][0] ='c';
        name[1][1] ='d';
        for (int k = 0; k < 2; k++) {
            for (int l = 0; l < 2; l++) {
                System.out.print(name[k][l]);
                System.out.print(" ");
            }
            
        }
    }
}
