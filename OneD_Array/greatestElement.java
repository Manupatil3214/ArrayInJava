import java.util.*;
package OneD_Array;

public class greatestElement {
    public static void main(String[] args) {
        int i;
        int arr[] = { 7, 9, 4, 90, 22, 1 };
        System.out.println("elements are :-");
        // print array

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // find greastest Element

        int g = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > g) {
                g = arr[i];
            }
        }
        System.out.println("Greatest elements are :-" + g);

    }

}
