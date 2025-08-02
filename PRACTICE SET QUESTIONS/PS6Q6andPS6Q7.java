public class PS6Q6andPS6Q7 {
    public static void main(String[] args) {
        //PS6Q6: to find max ele in the array
        int [] arr = {1,2,4,596,-690,4585,4764,34,2,49};
        int max = Integer.MIN_VALUE;
        for(int e:arr){
            if(e>max){
                max =e;
            }
        }
        System.out.println("the max ele in the array is: "+ max);

        // PS6Q7: to find min ele in the array
        int [] arr1 = {1,2,4,596,-690,4585,4764,34,2,49};
        int min = Integer.MAX_VALUE;
        for(int e:arr1){
            if(e<min){
                min =e;
            }
        }
        System.out.println("the min ele in the array is: "+ min);

    }
}
