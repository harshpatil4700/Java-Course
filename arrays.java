public class arrays {
    public static void main(String[] args) {
        int [] marks = new int [5];
        //System.out.println(marks);   // empty array
        marks [0]=100;
        marks [1]=91;
        marks [2]=75;
        marks [3]=70;
        marks [4]=90;
        System.out.println(marks);   // cant print an array with sysout() method
        System.out.println(marks[2]);   // prints the element present at 2th location in array
        System.out.println("value at 4th location before update: "+marks[4]);   // prints the element present at 4th location in array

        marks[4]=85;  // the previous value gets overwritten
        System.out.println("value at 4th location after update: "+ marks[4]);
        
        marks[5]=69;
        System.out.println(marks[5]);   //error: index 5 is out of bound for length 5
            }
}

/*
types of array initiallisation:-

1. int [] marks = new int [5];

2. int [] marks;
   marks=new int [5];

3. int [] marks={100,35,70,68,89};
*/

