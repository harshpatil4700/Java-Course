public class PS3Q4 {
    public static void main(String[] args) {
        String str = "this string  contains double   and triple spaces";
        System.out.println(str.indexOf("  "));     // searches double spaces i.e "  "
        System.out.println(str.indexOf("   "));    // searches triple spaces i.e "   "
    
        String str1 = "this string   contains double and triple spaces";
        System.out.println(str1.indexOf("  "));     
        System.out.println(str1.indexOf("   ")); 
        // result of both is same indicates that at that index triple spaces are present which also contains double spaces
    }
}
