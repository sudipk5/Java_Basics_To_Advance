import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int a;
        System.out.println("Enter 1st number");
        a=input.nextInt();
        int b;
        System.out.println("Enter 2nd number");
        b=input.nextInt();
        System.out.println(Gcd(a,b));

    }
    public static int Gcd(int num , int num2){
        int i=2;
        int j=1;
        int l=least(num,num2);

        while (i<=l){
            if (num%i==0 && num2%i==0){
                j=i;

            }
            i++;




        }
        return j;

    }
    public static int least(int n1 , int n2){

        if(n1<n2){
            return n1;
        }else {
            return n2;
        }

    }

 }
