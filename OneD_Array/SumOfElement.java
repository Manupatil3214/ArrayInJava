import java.util.*;
package OneD_Array;

public class SumOfElement {
    public static void main(String[] args) {
        int i;
        int Sum = 0;
        int a[] = new int[6];
        Scanner v = new Scanner(System.in);
        System.out.println("Enter Six array:=");
        for (i = 0; i < a.length; i++) {
            a[i] = v.nextInt();
        }
        System.out.println("Elements are=>");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (i = 0; i < a.length; i++) {
            Sum = Sum + a[i];
        }
        System.out.println("All Elements Sum=>" + Sum);

    }

}
