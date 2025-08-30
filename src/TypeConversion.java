import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
//        double a=(int) 1.199;
//        System.out.println(a);



        System.out.println("Enter the 1st number ");
        int a =input.nextInt();
        System.out.println("Enter the 2nd valu");
        int b= input.nextInt();


        int c=a;
         a=b;
         b=c;
         System.out.println("This is swap valu =");
         System.out.println("This is a = "+a);
         System.out.println("This is b ="+b);



    }
}
