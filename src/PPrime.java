import java.util.Scanner;

public class PPrime {
 public static void main(String[] args){
     Scanner input=new Scanner(System.in);

     int a;
     System.out.println("Enter a NUmber ");
     a=input.nextInt();
     int b=2;

     if( a==1 || a==2 || a==3 ||a==25  ){

     } else {



         int i=2;


         while (i<a){
             if (i%a==0){
                 b=0;
             }else {
                 b=1;
             }
             i++;

         }

     }
         if (b == 0 ) {
             System.out.println("not prime");
         } else {
             System.out.println("prime");
         }






 }
}
