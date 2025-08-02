class employee{
    int id;
    int salary;
    String name;

    public void getdetails(){    // method or function of class employee
        System.out.println("my id is: "+id);
        System.out.println("my name is: "+name);
    }
    public int getsalary(){
        return salary;
    }
}

public class creating_custom_class {
    public static void main(String[] args) {
        System.out.println("this is a custom class");
        employee harsh = new employee();  //instantiating a new employee
        employee john = new employee();
        //setting attributes
        harsh.id = 7;
        harsh.salary=12;
        harsh.name="HMP";
        john.id = 9;
        john.salary=3;
        john.name="john cena";
        //printing the attributes
        System.out.println(harsh.id);
        System.out.println(harsh.name);

        //rather than printing details like above we can call the method directly who does the same function
        harsh.getdetails();
        john.getdetails();
        harsh.getsalary();
        john.getsalary();
        System.out.println(john.salary);
        System.out.println(harsh.salary);
    }
}
