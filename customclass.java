


class EMo{
    String name;
    int age;
    int salary;
    public  void Getsalary(){
        System.out.println(name + "'s salary is " + age);

    }
    public void Getname(){
        System.out.println("Name is "+ name);
    }

}
public class customclass {

    public static void main(String[] args) {
        System.out.println("our custom class");
        EMo a =new EMo();
        a.age=12;
        a.name = "Anuj";
        a.Getname();
        a.Getsalary();

    }
}
