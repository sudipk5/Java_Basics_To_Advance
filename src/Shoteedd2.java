
import java.util.Scanner;

public class Shoteedd2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size:");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the Array values:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        checkSorted(array);
    }

    public static void checkSorted(int[] a) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                ascending = false;
            }
            if (a[i] < a[i + 1]) {
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("Sorted small to large (ascending)");
        } else if (descending) {
            System.out.println("Sorted large to small (descending)");
        } else {
            System.out.println("Not sorted");
        }
    }
}
