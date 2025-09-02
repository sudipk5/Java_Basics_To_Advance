import java.util.Scanner;

public class Prime_NUmber {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("Enter any number");
        a=input.nextInt();

        Prime(a);



    }
    public static void Prime(int a){
        int i=2;

        while (i<=a){
            if(a%1==0 && a%a==0 && a%i==1){



                System.out.println("prime");









            }else {
                System.out.println("Not prime");

            }
            i += a;


        }


    }
}
