// public class PS7Q3 {
//     static int sum (int n){
//         int res=0;
//         for(int i=1;i<=n;i++){
//             res += i;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         System.out.println("sum of first 10 natural nos. is: "+sum(10));
//     }
// }


public class PS7Q3 {
    static int sum (int n){
        int res=0;
        if(n==1){
            return n;
        }
        else{
            res = n+sum(n-1);
            return res;
        }
    }
    public static void main(String[] args) {
        System.out.println("sum of first 10 natural nos. is: "+sum(10));
    }
}