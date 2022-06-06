package Important_Q;

public class RemoveDuplicateValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 5 };

        int tem[] = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                tem[j++] = arr[i];
            }

        }
        tem[j++] = arr[arr.length - 1];
        for (int k = 0; k < j; k++) {
            System.out.println(tem[k]);
        }
    }
}
