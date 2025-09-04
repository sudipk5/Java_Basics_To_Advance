import java.util.Scanner;

public class Fibonacci {

public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int a;
    System.out.println("Enter a valu");
    a=input.nextInt();
    int f=0;
    int s=1;


    while (f+s<=a){

        int t=f+s;

        System.out.println(t +"");


        f=s;
        s=t;
    }

}

}
