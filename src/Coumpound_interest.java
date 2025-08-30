import java.util.Scanner;

public class Coumpound_interest {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);

        double p;
        System.out.println("Enter the parent");
        p=input.nextDouble();
        double t;
        System.out.println("Enter The Time");
        t=input.nextDouble();
        double r;
        System.out.println("Enter the Rate");
        r=input.nextDouble();



        System.out.println("CI = "+ p*(1+r/100)*t );




    }


}
