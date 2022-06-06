package TwoD_Array;

import java.util.Scanner;

public class ReadTwoD {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("Enter Elements 2D Array: ");
        int a[][] = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = v.nextInt();
            }
        }

    }
}
