inport package jenkins;

 public class Emp{
    int id;
    String name;
    int age ;
    double salary;
    Emp(int id,String name,int age,double salary){
        this.id=id;
        this.name=name;
        this.age=age;
        this.double=double;

    }
    void Display(){
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employee Age:"+age);
        System.out.println("Employee Salary:"+salary);
    }
    public static void main(String[] args){
        Emp obj=new Emp (id,name,age,salary);
        obj.Display();
    }
 }