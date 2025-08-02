// public class VarArgs {
//     static int sum(int a,int b){
//         return a+b;
//     }
//     static int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         System.out.println("the sum of 4 and 5 is "+ sum(4,5));
//         System.out.println("the sum of 4 and 5 is "+ sum(4,5,6));
//     }
// }  this method is too time taking and need to make multiple methods to avoid this we use VarArgs:

public class VarArgs {
    static int sum (int ...arr){
        // the above command will create an array of name arr as: int [] arr
        int res=0;
        for (int a:arr){
            res+=a;
        }
        return res;
    }

    static int sum1(int x,int ...array){   // method where 1 element is to be enetered compulsorily i.e x and sum with the array elements
        int res1=x; // x because 1 ele is compulsory
        for(int m:array){
            res1+=m;
        }
        return res1;
    }
// product of float nos.
    static int prod(int ...a){
        int result=1;
        for(int n:a){
            result *=n;
        }
        return result;
    }

    public static void main(String[] args) {
        //1st method
        System.out.println("the sum of nothing is: "+ sum());  // no element passed to arr hence display the int res
        System.out.println("the sum of 7 is: "+ sum(7));  // 1 element i.e 7 passed to arr hence display the int res as 0+7=7
        System.out.println("the sum of 7 and 10 is: "+ sum(7,10));  // 1 element i.e 7 passed to arr hence display the int res as 0+7=7
        System.out.println("the sum of 7,10,15 is: "+ sum(7,10,15));  // 1 element i.e 7 passed to arr hence display the int res as 0+7=7
        System.out.println("the sum of 7,110,15,69 is: "+ sum(7,10,15,69));  // 1 element i.e 7 passed to arr hence display the int res as 0+7=7

        //2nd method
       // System.out.println("the sum of nothing is: "+ sum1());   will give an error as no int x is passed 
        System.out.println("the sum of 2 is: "+ sum(2));  
        System.out.println("the sum of 2 and 12 is: "+ sum(2,12));  
        System.out.println("the sum of 2,3,4 is: "+ sum(2,3,4));  
        System.out.println("the sum of 2,,7,100,91 is: "+ sum(2,7,100,91));  

        //product of even nos.
        System.out.println("the product of first 5 even nos is: "+prod(2,4,6,8,10));
    }
}

