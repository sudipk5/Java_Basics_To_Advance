import java.util.Scanner;

public class Revers_Array {
   public static void main(String[]args){
       Scanner input=new Scanner(System.in );

       int a=0;
       System.out.println("Enter Array Size");
       a=input.nextInt();
       int [] Array=new int[a]; 

       System.out.println("Enmter Array valus");

       int i=0;
       while (i<Array.length){
           Array[i]=input.nextInt();

           i++;

       }

       System.out.println("this is yor Array");
       int j =0;
       while (j <Array.length){
          System.out.println(Array[j]);

           j++;

       }
       System.out.println("This is your Reverse Array");

       int r =j-1;
       while (r >=0){
           System.out.println(Array[r]);

           r--;

       }





   }
}
