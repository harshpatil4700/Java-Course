import java.util.Scanner;
class employee{
    int salary;
    String name;
    Scanner s = new Scanner(System.in);
    public int getsalary(){
        return salary;
    }
    
    public String getname(){
        return name;
    }

    public void setname(String n){
        name =n;
    }
}

public class PS8Q1 {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        employee harsh=new employee();
        employee harsh1=new employee();
        harsh.salary=15;
        harsh1.salary=30;
        harsh.setname("hmp");
        harsh1.setname("hmp4700");
        System.out.println(harsh.getname());
        System.out.println(harsh.getsalary());
        System.out.println(harsh1.getname());
        System.out.println(harsh1.getsalary());
    }
}
