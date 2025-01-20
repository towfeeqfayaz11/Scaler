package org.towfeeq.module2.Jan_15_25_Lecture5;

public class SumOfOddIndexedElements {
    // TC = O(q.n)
    // SC = O(1)
    public int[] solveBruteForce(int[] arr, int[][] queries){
        int n = arr.length;
        int q = queries.length;
        int[] result = new int[q];

        for(int i =0; i<q; i++){
            int s = queries[i][0];
            int e = queries[i][1];

            int sum = 0;
            for(int j=s; j<=e; j++){
                if(j%2 != 0){
                    sum = sum + arr[j];
                }
            }
            result[i] = sum;
        }

        return result;
    }

    // for a range based question, using prefix sum can be an approach!
    // TC = O(n+q)
    // SC = O(n)
    public int[] solveOptimal(int[] arr, int[][] queries){
        int n = arr.length;
        int q = queries.length;
        int[] result = new int[q];

        // prepare prefix sum array for even indexes
        int[] prefixSumOdd = new int[n];
        prefixSumOdd[0] = 0; // will be 0 value for odd index elements
        for(int i=1;i<n; i++){
            if(i%2 != 0){
                prefixSumOdd[i] = prefixSumOdd[i-1] + arr[i];
            }else{
                prefixSumOdd[i] = prefixSumOdd[i-1];
            }
        }

        for(int i=0; i<q; i++){
            int s = queries[i][0];
            int e = queries[i][1];

            int sum = 0;
            if(s == 0){
                sum = prefixSumOdd[e];
            }else{
                sum = prefixSumOdd[e] - prefixSumOdd[s-1];
            }

            result[i] = sum;
        }

        return result;
    }


    public static void main(String[] args) {
        SumOfOddIndexedElements o = new SumOfOddIndexedElements();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] queries = {
                {1,3},
                {4,7},
                {8,8},
                {5,5}
        };

        int[] result = o.solveBruteForce(arr, queries);
        for (int ele : result) {
            System.out.println(ele);
        }

    }

}
