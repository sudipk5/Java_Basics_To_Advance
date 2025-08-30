import java.util.Scanner;

public class Positive_Or_Negetive_Or_Zero {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        Double number;
        System.out.println("Enter any NUmber");
        number=input.nextDouble();

        if (number<0){
            System.out.println("This is Negetive");
        } else if (number>0) {
            System.out.println("This is Positiv");

        }else {
            System.out.println("This is Zero");
        }

    }
}
