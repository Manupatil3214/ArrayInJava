package TwoD_Array;

import java.util.Scanner;

public class greatest {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        int i, j;
        int a[][] = new int[2][5];
        System.out.println("Enter 10 Elements in Array : ");
        // Scannar

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                a[i][j] = v.nextInt();
            }

        }

        // Smallest Number

        int gre = a[0][0];
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                if (a[i][j] > gre) {
                    gre = a[i][j];
                }
            }
        }
        System.out.println("Greatest number is :" + gre);

    }
}
