import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Double NUmber;
        System.out.println("Enter any Number ");
        NUmber=input.nextDouble();
        if (NUmber%2==0){
            System.out.println("This is Even");
        }else {
            System.out.println("This is odd");
        }
    }
}

