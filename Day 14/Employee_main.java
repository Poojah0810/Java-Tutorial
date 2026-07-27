abstract class empl{
    protected String name;
    protected int id;
    protected int baseSalary;
    empl(String name, int id, int baseSalary){
        this.name = name;
        this.id = id;
        this.baseSalary= baseSalary;
    }
    abstract void bonus();
}
class manager extends empl{
    manager(String name, int id, int baseSalary){
        super(name,id,baseSalary);
    }
    void bonus(){
        System.out.println(baseSalary+baseSalary*0.10);
    }
}
class developer extends empl{
    developer(String name, int id, int baseSalary){
        super(name,id,baseSalary);
    }
    void bonus(){
        System.out.println(baseSalary+baseSalary*0.05);
    }
}
class intern extends empl{
    intern(String name, int id, int baseSalary){
        super(name,id,baseSalary);
    }
    void bonus(){
        System.out.println(baseSalary+baseSalary*0.15);
    }
}

public class Employee_main{
    public static void main(String[] args){
        empl m=new manager("Siva",10,1500);
        empl d=new developer("Stalin",11,1200);
        empl n=new intern("Saravana",12,1000);
        m.bonus();
        d.bonus();
        n.bonus();
    }

}
