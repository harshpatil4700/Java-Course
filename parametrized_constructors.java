class employee{
    private int id;
    private String name;

    public employee(int myid,String myname){    // parameterized constructor(p.c)
        id=myid;
        name=myname;
    }
    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public int getid(){return id;}
    public void setid(int i){this.id=i;}
}

public class parametrized_constructors {
    public static void main(String[] args) {
        employee e =new employee(88,"sher4700");   // due to p.c 88 stores in myid(=id) and sher4700 stores in myname(=name) 
        System.out.println(e.getid());
        System.out.println(e.getname());
    }
}
