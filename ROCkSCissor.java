import java.util.Random;
import java.util.Scanner;


public class ROCkSCissor {
    public static void main(String[] args){
    

    System.out.println("Rule of Game: \n 1 = Scissor , 2 = ROck , 3 = Paper.\nONly choose between 1 ,2,3 and enter only one number");
    System.out.println("Enter your choice" );
    Scanner sc = new Scanner(System.in);
    int uservalue = sc.nextInt();
    Random rand = new Random();
    int compvalue = rand.nextInt(4);
    System.out.println(compvalue +" "+ uservalue);

    if(compvalue==uservalue){
        System.out.println("Draw");
    }
    else if((compvalue ==1)&& (uservalue == 3)) {
        System.out.println("I won, Scissor Cuts Paper");

    }
    else if((compvalue ==1)&& (uservalue == 2)) {
        System.out.println("U won andu, Rock Destroys Scissors");

    }
    else if((compvalue ==2)&& (uservalue == 3)) {
        System.out.println("U won andu, Paper Covers ROck");

    }
    else if((compvalue ==2)&& (uservalue == 1)) {
        System.out.println("I won , Rock Destroys Scissors");

    }
   
    else if((compvalue ==3)&& (uservalue == 1)) {
        System.out.println("U won andu, Scissor Cuts Paper");

    }
    else if((compvalue ==3)&& (uservalue == 2)) {
        System.out.println("I won, Paper Covers ROck");

    }
    else{

        System.out.println("Please enter valid number or Try to play again");
    }

    System.out.println("You Choosed: " + uservalue +"\n I choosed " + compvalue ); 

    }
}
