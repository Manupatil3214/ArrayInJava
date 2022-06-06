package Important_Q;

public class FindMissingNumber {
    public static void main(String[] args) {
        // aray dhould not have duplicate
        // aray no need sorting order
        // value should be in range

        int a[] = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

        // sum of elements
        // 1+2+4+5=12;[Sum1]
        // 1+2+3+4+5=15;[sum2]
        // sum2-sum1=15-12=3 ..Missing number

        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];

        }

        System.out.println("Sum of element array is :" + sum1);

        int sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            sum2 = sum2 + i;

        }

        System.out.println("Sum of range element array is :" + sum2);
        System.out.println("Missing number of array is :" + (sum2 - sum1));

    }

}
