package org.towfeeq.module2.Jan_10_25_Lecture.AdditionalProblems;

/*
Problem Description
    Given an integer array A of size N. In one second, you can increase the value of one element by 1.
    Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints
    1 <= N <= 1000000
    1 <= A[i] <= 1000

Input Format
    First argument is an integer array A.

Output Format
    Return an integer denoting the minimum time to make all elements equal.

Example Input
    A = [2, 4, 1, 3, 2]
Example Output
    8

Example Explanation
    We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/

import java.util.ArrayList;

public class TimeToEquality {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        for(int ele: A){
            if(ele > max){
                max = ele;
            }
        }

        int seconds=0;
        for(int ele: A){
            seconds += max-ele;
        }

        return seconds;
    }
}
