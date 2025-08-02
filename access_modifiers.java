class employee{
    private int id;
    private String name;

    public void setid(int i){     // setter  
        id =i;
    }
    public int getid(){           // getter
        return id;   
    }
    public void setname(String n){    //setter
        name =n;
    }
    public String getname(){        //getter
        return name;
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        employee e=new employee();
        //e.id=100;      -->they throw an error due to private access modifiers which cant be accessed in main function 
        //e.name="emp";
        e.setname("emanuel");
        System.out.println(e.getname());
        e.setid(5);
        System.out.println(e.getid());
    }
}
