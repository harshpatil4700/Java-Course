// encrypting and decrypting a var.

public class PS2Q2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);    // type casting : here we type caste the grade from int(r=char+int=int) into char by wrting in paranthesis
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
