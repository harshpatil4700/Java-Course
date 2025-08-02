public class PS6Q2 {
    public static void main(String[] args) {
        int [] num = {5,10,15,20,25,30};
        int ele = 26;
        boolean isInArray = false;
        for(int a : num){
            if(a == ele){
                isInArray = true;
                break;
            }
        }
        if (isInArray){
            System.out.println(ele+" is present in array");
        }
        else{
            System.out.println(ele+" is not present in array");
        }
    }
}
