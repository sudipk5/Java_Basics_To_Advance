import java.util.Scanner;

public class DElete_Element {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int a=0;
        System.out.println("Enter array size");
        a=input.nextInt();
        System.out.println("Enter Array Element");

        int [] Array=new int[a];
        int i=0;
        while (i<Array.length){
           Array[i]=input.nextInt();
           i++;
        }

        System.out.println("This is your all Element");

        int j=0;
        while (j<Array.length){
            System.out.println(Array[j]);

            j++;
        }

        int b=0;
        System.out.println("Delete Any element");
        b=input.nextInt();

        int d=0;
        while (d<Array.length){
            if(b==Array[d]){
                Array[d]=0;
            }
            d++;
        }


        System.out.println("This is your Update Array");

        int p=0;
        while (p<Array.length){
            System.out.println(Array[p]);

            p++;
        }



    }










}
