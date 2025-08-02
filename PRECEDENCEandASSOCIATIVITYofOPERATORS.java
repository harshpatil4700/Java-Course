public class PRECEDENCEandASSOCIATIVITYofOPERATORS {
    public static void main(String[] args) {
        int a = 6*5-34/2;     // =30-34/2   =30-17   =13 {highest precedence goes to * and /. they are then evaluated by left to right associativity}
        int b = 60/5-34*2;     // =12-34*2  =12-68   = -56
        System.out.println(a);
        System.out.println(b);
        /* QUICK QUIZ 
        int k = (x-y)/2;
        int k = (b*b - 4*a*c)/(2*a);
        int k = v*v - u*u;
        int k = a*b-d;
        REFER THE IMAGE IN GRP FOR PRECEDENCE OF OPERATORS*/
    }
}
