import java.util.Scanner;

public class Leap_Year {
    public  static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //div by 4 not 100 ; div also 400

        double Number;
        System.out.println("Enter any Year ");
        Number = input.nextDouble();

        if ( (Number%4==0 || Number % 400 == 0) && (Number % 100 != 0) ) {

            System.out.println("This is Leap Year " );

        } else  {
            System.out.println("This is No Leap Year ");

        }


    }




}
