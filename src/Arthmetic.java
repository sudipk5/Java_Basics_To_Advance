import java.util.Scanner;

public class Arthmetic {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);



//        float num1=8;
//        float num2=9;
//        System.out.println(num1+num2);
//        System.out.println(num1*num2);
//        System.out.println(num1/num2);
//        System.out.println(num1-num2);
//        System.out.println(num1%num2);
//        System.out.println((8+9)/8%5);

//        int b=10;
//
//        int a=5;
//        a=--b;
//        System.out.println(a);



//        int a;
//
//        System.out.println("Enter the 1st Number");
//        a=input.nextInt();
//        int b;
//        System.out.println("Enter the 2nd number  ");
//        b=input.nextInt();
//        System.out.println("This is positive " + (a + b));
//        System.out.println("This is negative " + (a - b));
//        System.out.println("This is Division " + (a / b));
//        System.out.println("This is Multiplication " + (a * b));
//        System.out.println("This is Modulus " + (a % b));

        double num1;
        System.out.println("Enter 1st number");
        num1=input.nextDouble();
        double num2;
        System.out.println("Enter 2nd number");
        num2=input.nextDouble();

        double num3=(double)num1*num2;
        System.out.println("This is Multipliction " +(num1*num2));
        System.out.println(num3);





    }
}
