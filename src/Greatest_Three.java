import java.util.Scanner;

public class Greatest_Three {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int n1;
        System.out.println("Enter 1st Number");
        n1=input.nextInt();
        int n2;
        System.out.println("Enter 1st Number");
        n2=input.nextInt();
        int n3;
        System.out.println("Enter 1st Number");
        n3=input.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println("This is big Number 1 = "+ n1);
        } else if (n2>n1 && n2>n3) {
            System.out.println("This is big Number 2 = " + n2);

        }else {
            System.out.println("This is big Number 3 = "+ n3);
        }

    }
}
