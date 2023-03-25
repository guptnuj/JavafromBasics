


class EMo{
    String name;
    int age;
    public  void Gedetials(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class customclass {

    public static void main(String[] args) {
        System.out.println("our custom class");
        EMo a =new EMo();
        a.age=12;
        a.name = "Anuj";
        System.out.println();
        a.Gedetials();

    }
}
