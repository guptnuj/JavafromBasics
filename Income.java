import java.util.Scanner;

public class Income {
    public static void main(String[] args){
    float tax;
    System.out.println("enter your income");
    Scanner sc = new Scanner(System.in);
    int income = sc.nextInt();

    System.out.println(" your income "+ income);
    if(income>250000 && income<500000){
        tax = (5*income)/100.0f;
      
        System.out.println("Your tax is 5% , which is "+ tax );
    }
    else if(income>500000 && income<1000000){
        tax = (20*income)/100.0f;
        System.out.println("Your tax is 20% , which is "+ tax );

    }

    else if(income>2000000){
        tax = (30*income)/100.0f;
        System.out.println("Your tax is 30% , which is "+ tax );

    }

    else{
        System.out.println("NO tax baby" );
    }
    }
}
