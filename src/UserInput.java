//import java.util.Scanner;
//
//
//public class UserInput {
//
//   public static void main(String[] args){
//         Scanner input= new Scanner(System.in);
//
//
//       System.out.println("Please enter your name");
//       String name = input.nextLine();
//       System.out.println("Good morning "+name);
//
//       System.out.println("Enter your age");
//       int age= input.nextInt();
//       System.out.println(name +" is your age "+ age);
//
//
//   }
//}


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a Number");
        int a=input.nextInt();
        System.out.println("Enter second number");
        int b=input.nextInt();
        System.out.println("This is sum of two Number "+ (a+b));



    }
}
