package org.towfeeq.module2.Jan_13_25_Lecture4;


// given an array, rotate left by k
public class RotateArrayLeft {
    public void rotateArrayLeftBruteForce(int[] arr, int k){
        int n = arr.length;
        k = k % n; // avoid unnecessary cycles

        // logic to rotate the array k times
        for (int i = 0; i < k; i++) {

            // logic to rotate array once to the left
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    // logic to rotate the array k times using reverse approach
    public void rotateArrayLeftOptimal(int[] arr, int k){
        int n = arr.length;
        k = k % n; // avoid unnecessary cycles

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n - 1);

    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
