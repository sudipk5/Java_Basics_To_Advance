import java.util.Scanner;

public class Sarching_in_Array {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int [] arry=new int[10];
        int i=0;
        System.out.println("Enter numbers");
        while (i<arry.length){

            arry[i]=input.nextInt();


            i++;

        }
        int f=0;
        System.out.println("Enter your valu");
        f=input.nextInt();

        int j=0;
        while (j<arry.length){


            if(f==arry[i]){
                System.out.println("your valis index is "+j);

            }else {
                j++;
            }






        }

    }
}
