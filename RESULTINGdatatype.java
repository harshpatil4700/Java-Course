public class RESULTINGdatatype {
    public static void main(String[] args) {
        byte b = 5;
        short s = 120;
        int i = 200;
        long l = 57547737889L;
        float f =50.0f;
        double d = 100.0;
        char c = 'A';
        int r1 = b+s;                  
        System.out.println(r1);
        int r2 = s+i;
        System.out.println(r2);
        float r3 = l+f;
        System.out.println(r3);
        float r4 = i+f;
        System.out.println(r4);
        int r5 = c+i;
        System.out.println(r5);
        int r6 = c+s;
        System.out.println(r6);
        double r7 = l+d;
        System.out.println(r7);
        double r8 = f+d;
        System.out.println(r8);
    
        char c1 = 'a';     // char arithematic operations : here, it replaces the respective char by its equivalent ascii code value
        char c2= '2';
        int c3 = c1 + c2;
        System.out.println(c3);
    }
}
