import java.util.Scanner;

public class Sum_AND_Avarag_in_array {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

         int a=0;
         System.out.println("Enter Array size");
         a=input.nextInt();

        int [] Array=new int[a];

        System.out.println("Enter all valus");

        int i=0;
        while (i<Array.length){

            Array[i]=input.nextInt();



            i++;



        }

        int j=0;
        int c=0;

        while (j<Array.length){

             c=c+Array[j];






            j++;



        }
        System.out.println("sum" + c);
        System.out.println("Avarg" + (c/Array.length));

    }
}
