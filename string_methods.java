

public class string_methods {
    public static void main(String[] args) {
        String name = "harsh";

        int value = name.length();
        System.out.println(value);

        String lowercase = name.toLowerCase();
        System.out.println(lowercase);
        String uppercase = name.toUpperCase();
        System.out.println(uppercase);

        String nonTrimmedString = "    harsh    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());    //OR make a new string as String trimmedstring = nonTrimmedString.trim()   and then sys out it
        
        System.out.println(name.substring(2));   // prints characters from start(beginIndex) {here, 2} to last index of the string
        System.out.println(name.substring(0));   // it is an redundant call as it prints whole string so u can print string itself instead of this call

        System.out.println(name.substring(2,4));
        System.out.println(name.substring(0,5));        // whole string
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('h','m'));
        System.out.println(name.replace("rsh","ppy"));
        System.out.println(name.replace("h","java"));

        System.out.println(name.startsWith("ha"));
        System.out.println(name.startsWith("Ha"));   // false bcoz java uis case sensitive lang
        System.out.println(name.startsWith("sa"));

        System.out.println(name.endsWith("sh"));
        System.out.println(name.endsWith("sH"));
        System.out.println(name.endsWith("har"));

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
       //  System.out.println(name.charAt(5));   ERROR : the last char is at 4th index 

       System.out.println(name.indexOf('a'));
       System.out.println(name.indexOf("sh"));
       String name1 = "hashshshsh";
       System.out.println(name1.indexOf("sh"));   // result is 2 bcoz it considers the first occurence of sh in the string
       System.out.println(name.indexOf("as"));   //  result is -1 bcoz as is not found in the string 

        System.out.println(name.indexOf("s",2));
        System.out.println(name.indexOf("rsh",1));
        System.out.println(name.indexOf("a",2));   // -1 bcoz not found

        String name2 = "Harryrryrryrry";
        System.out.println(name2.lastIndexOf("rry"));
        System.out.println(name2.lastIndexOf("rry",7));
        System.out.println(name2.lastIndexOf("rry",5));  // result is 5 bcoz rry starts from index 5 and fromIndex i.e 5 is included in searching
        System.out.println(name2.lastIndexOf("rry",1));  // reult is -1 i.e NOT FOUND

        System.out.println(name.equals("harsh"));
        System.out.println(name.equals("Harsh"));   // false bcoz "harsh" and "Harsh" are different (CASE SENSITIVE)

        System.out.println(name.equalsIgnoreCase("HARSH"));
        System.out.println(name.equalsIgnoreCase("harsh"));
        System.out.println(name.equalsIgnoreCase("HaRsH"));
        System.out.println(name.equalsIgnoreCase("HARSHp"));  // false bcoz characters are not equal
        System.out.println(nonTrimmedString.equalsIgnoreCase("HARSH"));  // false bcoz characters are not equal
    
        System.out.println("I am escape sequence \" double quote");
        System.out.println("I am escape sequence \n double quote");  // new line
        System.out.println("I am escape sequence \t double quote");  // tab
        System.out.println("I am escape sequence \' single quote");  // single quote
        System.out.println("I am escape sequence \\ back slash");  // back slash
        System.out.println("I\'m harsh\tWELCOME TO JAVA\n all the best");  // example of escape sequence characters
        
    }
}
