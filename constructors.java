class employee{
    private int id;
    private String name;

    public employee(){
        id=100;
        name="harsh4700";
    }
    public String getname(){return name;}
    public void setname(String n){this.name=n;}
    public int getid(){return id;}
    public void setid(int i){this.id=i;}
}

public class constructors {
    public static void main(String[] args) {
        employee harsh = new employee();
        System.out.println(harsh.getid());   // set by constructor
        System.out.println(harsh.getname());  // set by constructor
        harsh.setid(90);
        harsh.setname("hmp");
        System.out.println(harsh.getid());  // set in main function ,so if we sysout harsh.getid() 
        //then o/p will be of the one set in main function and not of the constructor
        System.out.println(harsh.getname());  // set in main function
    }
}
