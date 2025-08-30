import java.util.Scanner;

public class Age_d {

    public static void main(String[] args){


        Scanner input= new Scanner(System.in);


        System.out.println("Enter your Name");
        String name = input.nextLine();




        System.out.println("Enter your Age");
        double age = input.nextDouble();
         input.nextLine(); // flush the \n left by nextDouble

        System.out.println("Are you Female? (yes/no)");
        String tt = input.nextLine(); // now this will wait for actual input


        boolean pp = false;

        if (tt.equalsIgnoreCase("yes")) {

            pp = true;
        }

        if (age <= 5) {

            System.out.println(name + " 75% OFF");

        } else if (age > 60) {

            System.out.println(name + " 60% OFF");

        } else if (pp) {

            System.out.println(name + " 50% OFF");

        }
        else {

            System.out.println(name + " No discount");

        }


    }
}
