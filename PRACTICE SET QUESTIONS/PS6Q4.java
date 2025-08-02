public class PS6Q4 {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{6,8,10}};
        int [][] arr2 = {{4,5,6},{9,5,8}};
        int [][] res = {{0,0,0},{0,0,0}};

        for (int i=0;i<arr1.length;i++){      // it will run row no.of times i.e 2
            for (int j=0;j<arr1[i].length;j++){     // it will run column no.of times i.e 3
                System.out.format("setting the value for i=%d and j=%d\n",i,j);
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i=0;i<arr1.length;i++){      // it will run row no.of times i.e 2
            for (int j=0;j<arr1[i].length;j++){     // it will run column no.of times i.e 3
                System.out.format(res[i][j]+" ");
                res[i][j] = arr1[i][j] + arr2[i][j];
            }
            System.out.println(" ");
        }
    }
}
