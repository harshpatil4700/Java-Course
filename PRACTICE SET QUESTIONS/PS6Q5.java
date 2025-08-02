public class PS6Q5 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        System.out.print("before reversing : ");
        for (int a:arr){
            System.out.print(a+" ");
        }
        for (int i = 0;i<n;i++) {
            //swap a[i] and a[(l-1)-i] i.e first and last ,second and second last and so on...
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        System.out.print("\nafter reversing : ");
        for(int a :arr){
            System.out.print(a +" ");
        }
    }
}

// 2nd method (self try) :-

        // float [] marks ={68.5f,40.5f,41.0f,58.25f,54.65f};
        // System.out.print("the array before reversing: ");
        // for(float a:marks){
        //     System.out.print(a);
        //     System.out.print(" ");
        // }

        // System.out.print("\nthe array after reversing: ");
        // for(int i = marks.length-1;i>=0;i--){
        //     System.out.print(marks[i]);
        //     System.out.print(" ");
        // }

