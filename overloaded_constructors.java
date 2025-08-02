class employee{
    private int id;
    private String name;

    public employee(){
        id=100;
        name="harsh4700";
    }
    public employee(String name1){        
        id=50;
        name=name1;
    }
    public employee(int myid,String myname){    // parameterized constructor(p.c)
        id=myid;
        name=myname;
    }

    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public int getid(){return id;}
    public void setid(int i){this.id=i;}
}
public class overloaded_constructors {
    public static void main(String[] args) {
        employee e = new employee();    // no of parameters = 0 (default constructor)
        System.out.println(e.getid());
        System.out.println(e.getname());

        employee e1 = new employee("harshPatil");  // no of parameters = 1
        System.out.println(e1.getid());
        System.out.println(e1.getname());

        employee e2 = new employee(91,"suiii");   // no of parameters = 2
        System.out.println(e2.getid());
        System.out.println(e2.getname());
    }
}

// QUICK QUIZ:-
// class majdoor{
//     private int salary;
//     private int sal=10000;   // salary after salary increment
//     private String name;

//     public majdoor(){       // before salary increment
//         salary = 5000;
//         name="harsh";
//     };

//     public majdoor(int sal){      // after salary increment
//         salary = sal;
//     };

//     public String getname(){return name;}
//     public void setname(String n){this.name=n;}
//     public int getsalary(){return salary;}
//     public void setid(int i){this.salary=i;}
// }

// public class overloaded_constructors {
//     public static void main(String[] args) {
//         majdoor m = new majdoor();
//         System.out.println(m.getname());
//         System.out.println("salary before salary increment: "+m.getsalary());

//         majdoor m1= new majdoor(10000);
//         System.out.println("salary after salary increment: "+m1.getsalary());
//     }
// }