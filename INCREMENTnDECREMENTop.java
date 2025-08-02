public class INCREMENTnDECREMENTop {
    public static void main(String[] args) {
        int  i = 10;
        System.out.println(i++);        // increment i in memory but returns previous value
        System.out.println(i);          // this is incremented value due to i++
        System.out.println(++i);        // increments the value and returns it
        System.out.println(i);          // incremented value due to ++i
        int x = 7;
        System.out.println(++x * 8);
        char c ='a';
        System.out.println(++c);
    }
}
