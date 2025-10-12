import java.util.Scanner;

public class PALIN_drome {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=0;
        System.out.println("Enter Array size");
        a=input.nextInt();
        int [] Array=new int[a];
        System.out.println("Enter Array valus");
        int i=0;
        while (i<Array.length){
            Array[i]=input.nextInt();
            i++;
        }
        int [] ANar=new int[i-1];

        int j =0;

        int d=i-1;

        while (d >=j){

           ANar[j]=Array[d];

            j++;

            d--;
        }

        int p=0;
        while (p<ANar.length){

            System.out.println(ANar[p]);

            p++;

        }

    }
}
