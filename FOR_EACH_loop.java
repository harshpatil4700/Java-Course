public class FOR_EACH_loop {
    public static void main(String[] args) {
        // ARRAY LENGTH:
        float [] marks ={91.1f, 40.0f, 60.9f,85.5f};
        System.out.println(marks.length);   // returns the length of marks array

        String [] students={"abc","def","ghi","mno","pqr","xyz"};
        System.out.println(students.length);

        //DISPLAYING AN ARRAY USING FOR LOOP(naive way):
        for(int i =0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        for(int i =0;i<students.length;i++){
            System.out.println(students[i]);
        }
        
        // DISPLAYING AN ARRAY IN REVERSE ORDER
        System.out.println("\ndisplaying the marks array in reverse order:");
        for(int i =marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //displaying an array using for each loop:
        System.out.println("displaying array using for each loop:");
        for(float a : marks){
            System.out.println(a);
        }
    }
}
