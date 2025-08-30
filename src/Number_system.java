import java.util.Scanner;

public class Number_system {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter any Nuumber ");
        number=input.nextInt();
        int number2;
        System.out.println("Enter any Nuumber ");
        number2=input.nextInt();

        System.out.println("num1 & num2 = " + (number&number2));
        System.out.println("num1 | num2 = " + (number|number2));
        System.out.println("num1 ^ num2 = " + (number^number2));
        System.out.println("~ num1 = " + (~number));
        System.out.println("num1 << num2 = " + (number<<number2));
        System.out.println("num1 >> num2 = " + (number>>number2));





    }
}
