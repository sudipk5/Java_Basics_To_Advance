import java.util.Scanner;

public class Number_of_occurrences {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);


        int a=0;
        System.out.println("Enter array Size");
        a=input.nextInt();
        int[] array=new int[a];

        int i=0;

        System.out.println("Enter array valus");

        while (i<array.length){

            array[i]=input.nextInt();

            i++;
        }
        int f=0;
        System.out.println("Enter Find valu ");
         f=input.nextInt();
        int c=0;
        int j=0;
        while (j<array.length){
            if (f==array[j]){
                c++;
            }
               j++;


        }
        System.out.println(c + "  Times" );


    }
}
