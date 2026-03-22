public class array_sort {
    public static void main(String[] args) {
        int arr[] = { 10, 4, 5, 7, 6, 1 };

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                int temp = 0;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i+1] = temp;
                i = -1;
            }
        }
        for (int n : arr) {
            System.out.println(n + " ");
        }
    }

}
