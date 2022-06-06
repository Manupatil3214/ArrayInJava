package TwoD_Array;

import java.util.*;

public class simpleTwoD {
    public static void main(String[] args) {
        int arr[][] = { { 3, 5, 8 }, { 9, 1, 10 }, { 8, 10, 32 } };
        // System.out.println(arr[2][3]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr[" + i + "][" + j + "]" + arr[i][j]);
            }
        }

    }

}
