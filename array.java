// public class array {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         System.out.println(arr[0]);
//         System.out.println(arr.length);
//         System.out.println(arr.length-1);
//     }

// }

//find max value in array

// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         int max = arr[0];
//         for (int i = 0; i <= arr.length - 1; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }

//2nd max value 

// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6, 9, 7 };
//         int max = arr[0];
//         int secMax = arr[0];
//         for (int i = 0; i <= arr.length - 1; i++) {
//             if (arr[i] > max) {
//                 secMax = max;
//                 max = arr[i];
//             } else if (arr[i] > secMax && arr[i] != max) {
//                 secMax = arr[i];
//             }
//         }
//         System.out.println(secMax);
//     }
// }

// find the min value in array

// public class array {
// public static void main(String[] args) {
// int arr[] = { 1, 2, 3, 4, 0, 6 };
// int min = arr[0];
// for (int i = 0; i <= arr.length - 1; i++) {
// if (arr[i] <= min) {
// min = arr[i];
// }
// }
// System.out.println(min);
// }
// }

//find second min value

// public class array {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 0 ,6 };
//         int min = arr[0];
//         int secmin =arr[0];
//         for (int i = 0; i <= arr.length-1; i++) {
//             if (arr[i] <= min) {
//                 secmin=min;
//                 min = arr[i];
//             }
//             else if(arr[i] < secmin && arr[i] > min){
//                 secmin=min;
//             }
//         }
//         System.out.println(secmin);
//     }
// }

//print pair of index having sum 6

public class array {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 0, 6 ,7 };
        int target = 6;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }
}