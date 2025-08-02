// pgm to replace the spaces with underscores in the string

public class PS3Q2 {
    public static void main(String[] args) {
        String book = "Pride and     Prejudice";
        System.out.println("before replacing: " + book);
        book = book.replace(' ','_');
        System.out.println("after replacing: " + book);
    }
}
