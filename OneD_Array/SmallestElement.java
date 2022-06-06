import java.util.*;
package OneD_Array;

public class SmallestElement {
    public static void main(String[] args) {
        int i;
        int arr[] = { 7, 9, 4, 90, 22, 10 };
        System.out.println("elements are :-");
        // print array

        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // find greastest Element

        int g = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < g) {
                g = arr[i];
            }
        }
        System.out.println("Smallest elements are :" + g);

    }

}
