import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int[] array=new int[10];

        int i=0;
        while (i<array.length){
            System.out.println("Enter your Roll number ");
            array[i]=input.nextInt();

            i++;

        }
        int j=0;
        while (j<array.length){
            System.out.println("This is your Roll number");
            System.out.println(array[j]);


            j++;

        }




    }
}
