import java.util.Scanner;

public class Drivving_Licence {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);


        double age;
        System.out.println("Enter your age");
        age=input.nextDouble();

        if (age>=18){
            System.out.println("You are eligible for driving licence");
        }else{
            System.out.println("You are No eligible");
        }

    }
}
