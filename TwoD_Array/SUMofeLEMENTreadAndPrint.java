package TwoD_Array;

import java.util.Scanner;

public class SUMofeLEMENTreadAndPrint {
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

        // print
        System.out.println("2*5 2D Elements in Array : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        // sum of elements
        System.out.println("2*5 2D Elements in Array Sum : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 5; j++) {
                sum = sum + a[i][j];
            }
            System.out.println(" ");
        }
        System.out.println("Elements Sum : " + sum);
    }
}
