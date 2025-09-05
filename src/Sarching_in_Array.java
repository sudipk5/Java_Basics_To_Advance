import java.util.Scanner;

public class Sarching_in_Array {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=0;
        System.out.println("Enter array size");
        a=input.nextInt();
        int [] arry=new int[a];

        System.out.println("Enter Numbers");
        int i=0;

        while (i<arry.length){
            arry[i]=input.nextInt();
            i++;
        }
        int f=0;
        System.out.println("Enter your Sarching valu");
        f=input.nextInt();

        int j=0;
        while (j<arry.length){


            if(f==arry[j]){
                System.out.println("your valis index is "+ (j+1));

            }
                j++;


        }

    }
}
