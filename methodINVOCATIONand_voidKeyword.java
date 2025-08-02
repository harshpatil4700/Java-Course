public class methodINVOCATIONand_voidKeyword {
    // VOID KEYWORD EXPLAINATION:
    static void tellJoke(){        // void keyword
        System.out.println("laughter is a medicine but laughing without reson needs a medicine!");

    }

    //CASE 1 : CHANGING AN INTEGER:
    static void change(int a){
       a=98;
    }

    //CASE 2: CHANGING AN ARRAY:
    static void change1(int [] arr){
        arr[0]=98;
    }
    
    public static void main(String[] args) {
        tellJoke();   // VOID KEYWORD EXPLAINATION
        
        //case1: CHANGING AN INTEGER
        int x= 45;
        change(x);
        System.out.println("the value of x after running change is: "+x);

        //CASE 2: CHANGING AN ARRAY
        int [] marks ={52,73,77,89,98,94};
        change1(marks);
        System.out.println("the value of marks array after running change is: "+ marks[0]);

    }
}
