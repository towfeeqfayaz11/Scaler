package org.towfeeq.module2.Jan_13_25_Lecture4;

public class RotateArrayRight {
    public void rotateArrayRightBruteForce(int[] arr, int k){

        int n = arr.length;
        k = k % n; // avoid doing unnecessary cycles

        // logic to rotate array k times
        for(int i=0; i<k; i++){

            // logic to rotate array one time to right
            int temp = arr[n-1];
            for(int j=n-2; j>=0; j--){
                arr[j+1] = arr[j];
            }
            arr[0] = temp;

        }

    }


    // taking help of reverse logic
    public void rotateArrayRightOptimal(int[] arr, int k){
        int n = arr.length;
        k = k % n; // avoid doing unnecessary cycles

        // reverse entire array
        reverseArr(arr, 0, n-1);

        // reverse first k elements
        reverseArr(arr, 0, k-1);

        // reverse remaining elements
        reverseArr(arr, k, n-1);
    }

    private void reverseArr(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
