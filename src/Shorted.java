import java.util.Scanner;
public class Shorted {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        int a=0;
        System.out.println("Enter Array Size");
        a=input.nextInt();
        int[] array=new int[a];

        System.out.println("Enter the Array valus");
        int i=0;
        while (i<array.length){
            array[i]=input.nextInt();
            i++;
        }


        Short(array);










    }



    public static  void Short(int [] a){

        int c=0;
        int d=0;



        int i=0;
        while (i<a.length-1){

            if(a[i]<=a[i+1]){
                c++;
            } else if (a[i]>=a[i+1]) {

                d++;


            }

            i++;
        }


        if(c==a.length-1){
            System.out.println("Shorted small to larg");
        } else if (d==a.length-1) {
            System.out.println("Shorted larg to small");
        }else {
            System.out.println("not shorted");
        }


    }



}

