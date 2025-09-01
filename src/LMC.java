import java.util.Scanner;

public class LMC {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);

            int num1;
            System.out.println("Enter 1st number = ");
            num1=input.nextInt();
            int num2;
            System.out.println("Enter 1st number = ");
            num2=input.nextInt();
            System.out.println(Lmc(num1,num2));

        }
        public  static  int Lmc(int number1 ,int number2){
            int i=1;
            while (true){
                int factor=number1*i;
                if(factor%number2==0){
                   return factor;

                }
               i++;
            }
        }
}
