

class employee {
    private int salary;
    public employee(int s){
     salary = s;
    }
    public void setSalary(int i){
        salary = i;
    }
    public int getSalary(){
        return salary;
    }


}
public class constructors {


    public static void main(String[] args) {

        employee i = new employee(2000);

        System.out.println(i.getSalary());
    }
}
