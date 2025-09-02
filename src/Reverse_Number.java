import java.util.Scanner;
public class Reverse_Number {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int a;
        System.out.println("Enter any valu ");
        a=input.nextInt();
        int i=0;
        int n=0;
        int b=0;
        while (b<=a){
            n =a%10;
            i=i*10+n;
            a/=10;
            b++;

        }
        System.out.println(i);

    }
}
