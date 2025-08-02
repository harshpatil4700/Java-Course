public class operators {
    public static void main(String[] args) {
    // 1. ARITHEMATIC OPERATORS
        int x = 8;
        System.err.println(x+2);
        int y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);        // modulo operator
        System.out.println(4.8%1.1);    // modulo operator with floats or doubles (returns decimal value)
        System.out.println(x++);        // increments in backyard but returns the previous value (which can be checked by print x in next step)
        System.out.println(++x);        // increments the value and returns it
        System.out.println(x--);        // decrement the value but returns the previous value (which can be checked by print x in next step)
        System.out.println(--x);        // decrements the value and returns it

    // 2. ASSIGNMENT OPERATORS
        int z = 10;
        System.out.println(z);
        z += 5;
        System.out.println(z); 
        z -= 5;
        System.out.println(z); 
        z *= 5;
        System.out.println(z); 
        z /= 5;
        System.out.println(z); 
        z %= 6;
        System.out.println(z); 

    // 3. COMPARISON OPERATORS
        System.out.println(5==5);   // equal to operator
        System.out.println(5==6);
        System.out.println(5!=5);   // not equal to operator
        System.out.println(5<6);
        System.out.println(5>6);
        System.out.println(5>=6);
        System.out.println(5<=6);
    
    // 4. LOGICAL OPERATORS
        System.out.println(64>5 && 64>16);
        System.out.println(64>70 && 64>16);
        System.out.println(64>70 || 64>16);
        System.out.println(64>70 || 64>69);

    // 5. BITWISE OPERATORS
        System.out.println(2&3);   // bitwise AND (check notes for logic )
        System.out.println(2|3);   // bitwise OR (check notes for logic )
    }
}
