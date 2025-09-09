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
       int c=array[1];
        int j=0;
        while (j<array.length){
            if(b>array[j]){b=array[j];}
            if (c<array[j]){c=array[j];}



            j++;
        }

        System.out.println("This is most mini value " + b);
        System.out.println("This is most Max value " + c);

    }
}
