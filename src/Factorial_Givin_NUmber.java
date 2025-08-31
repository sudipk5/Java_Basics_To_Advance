import java.util.Scanner;
public class Factorial_Givin_NUmber {
    public static int Factorl(int a){
        int i=1;
        int b=1;
     while (i<=a){
         b=b*i;
         i++;
     }
       return b;
    }




    public static void main(String[] args){
        //n × (n - 1)
        Scanner input= new Scanner(System.in);
        int number;
        System.out.println("Enter ant number");
        number=input.nextInt();

        System.out.println(Factorl(number));





    }
}
