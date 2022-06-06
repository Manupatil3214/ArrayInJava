package TwoD_Array;

import java.util.Scanner;

public class AccessTwoArray {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter Elements 2D Array: ");
        int a[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = v.nextInt();
            }
        }
        int i;
        int j;
        System.out.println(" Elements 2D Array: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("Array[" + i + "][" + j + "]" + a[i][j]);
            }
        }

    }
}
