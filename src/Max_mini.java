import java.util.Scanner;

public class Max_mini {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=0;
        System.out.println("Enter array size");
        a=input.nextInt();
        int [] array=new int[a];
        System.out.println("Enter all values");
       int i=0;
       while (i<array.length){
           array[i]=input.nextInt();
           i++;
       }
       int b=array[1];
        int j=0;
        while (j<array.length){
            if(b>array[j]){b=array[j];}



            j++;
        }

        System.out.println("This is most small value " + b);

    }
}
