import java.util.Scanner;

public class Array_2D {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int a=0;
        System.out.println("Enter array colum size");
        a=input.nextInt();


        int b=0;
        System.out.println("Enter array Row size");
        b=input.nextInt();

        int [] [] newarray=new int[a][b];

        System.out.println("Entyer Your Valus");

        int i=0;
        while (i<newarray.length){
            int j=0;
            while (j<newarray.length){
                newarray[i][j]=input.nextInt();
                j++;

            }
            i++;

        }



        System.out.println("This is  Your Valus");
        int p=0;
        while (p<newarray.length){
            int l=0;
            while (l<newarray.length){
              System.out.println(newarray[p][l]);
                l++;

            }
            p++;

        }

    }

}
