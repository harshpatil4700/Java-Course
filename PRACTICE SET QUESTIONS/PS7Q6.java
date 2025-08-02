public class PS7Q6 {
    static float num (float ...a){
        float sum =0;
        for(float m:a){
            sum+=m;
        }
        float avg =sum/a.length;
        return avg;
    }

    public static void main(String[] args) {
        System.out.println(num(5,6,7,8,9));
        System.out.println(num(1,2,3,4,5,6));
    }
}
