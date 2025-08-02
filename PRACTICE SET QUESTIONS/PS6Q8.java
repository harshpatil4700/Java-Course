public class PS6Q8 {
    public static void main(String[] args) {
        boolean isSorted= true;
        int [] arr = {1,2,34,56,78,90};
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
