import java.util.Scanner;
public class Sum_Of_Digits {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num=input.nextInt();
        System.out.println(Digits(num));
    }
    public static int Digits(int num){
        int i=0;
        while (num>0){
            i+= (num%10);
            num=num/10;
        }
       return i;
    }
}
