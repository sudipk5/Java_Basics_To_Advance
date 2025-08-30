import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int a;
        System.out.println("Enter Any Number ");
        a=input.nextInt();

        System.out.println("This is the Multiplication Table :");
        int i=1;
        while (i<=10){
            System.out.println(("2*" +i + "= ")+(i*a));
            i++;
        }

    }
}
