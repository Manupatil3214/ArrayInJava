package TwoD_Array;

public class Initiliaze_PrintTwoD {
    public static void main(String[] args) {
        int i, j;
        int Arr[][] = { { 2, 4 }, { 3, 8 }, { 5, 9 } };

        System.out.println("Array Element Is: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 2; j++) {
                // System.out.println("Array[" + i + "][" + j + "]" + Arr[i][j]);
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
