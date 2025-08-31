import java.util.Scanner;

public class Sum_All_oddnumbers {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int a;
        System.out.println("Enter any Number :");
        a=input.nextInt();

        int i=1;
        int c=0;


        while (i<=a){
            if(i%2==1){

                c=c+i;

            }
            i++;

        }

        System.out.println(c);

    }
}
