package org.towfeeq.module2.Jan_10_25_Lecture3.AdditionalProblems;

/*
Problem Description
    You are given an integer array A. You have to find the second largest element/value in the array
    or report that no such element exists.

Problem Constraints
    1 <= |A| <= 105
    0 <= A[i] <= 109

Input Format
    The first argument is an integer array A.

Output Format
    Return the second largest element. If no such element exist then return -1.

Example Input
    Input 1:
    A = [2, 1, 2]
    Input 2:
    A = [2]

Example Output
    Output 1:
    1
    Output 2:
    -1

Example Explanation
    Explanation 1:
        First largest element = 2
        Second largest element = 1
    Explanation 2:
        There is no second largest element in the array.
*/

import java.util.ArrayList;

public class SecondLargest {
    public int solve(ArrayList<Integer> A) {
        if(A.size() <=1){
            return -1;
        }

        int max = A.get(0);
        int secondMax = -1;

        for(int ele: A){
            if(ele > max){
                secondMax = max;
                max = ele;
            }else if(max == secondMax || (ele!=max && ele>secondMax)){
                secondMax = ele;
            }
        }

        return secondMax;
    }
}
