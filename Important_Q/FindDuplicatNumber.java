package Important_Q;

public class FindDuplicatNumber {
    public static void main(String[] args) {
        // String arr[] = { "java", "c++", "c", "mysql", "java" };
        int arr[] = { 1, 2, 3, 4, 4, 5 };

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found Dupicate Element:" + arr[i]);
                    flag = true;
                }

            }
        }
        if (flag == false) {
            System.out.println("Duplicate not found");
        }
    }

}
