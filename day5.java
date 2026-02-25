import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        int arr[] = {
            10,
            3,
            5,
            6,
            2
        }, k = 3;

        System.out.println("Maximum sum is " + maximumSumSubarraySizeK(arr, k) + " Count of " + k);

        System.out.println("longest Consecutive Sequences is " + longestConsecutiveSequences(arr));

        System.out.println(Arrays.toString(productArrayExceptBySelf(arr)));



    }

    static int maximumSumSubarraySizeK(int arr[], int k) {

        int maxSum = 0;

        for (int i = 0; i <= arr.length - k; i++) {

            int curSum = 0;
            for (int j = 0; j < k; j++) {
                curSum += arr[i + j];
            }
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;

    }

    static int longestConsecutiveSequences(int arr[]) {

        Set < Integer > set = new HashSet < > ();
        int res = 0;

        for (int i: arr)
            set.add(i);

        for (int i: arr) {

            if (set.contains(i) && !set.contains(i - 1)) {
                int cur = i, cnt = 0;

                while (set.contains(cur)) {
                    set.remove(cur);
                    cur++;
                    cnt++;
                }

                res = Math.max(res, cnt);
            }
        }

        return res;

    }

    static int[] productArrayExceptBySelf(int arr[]) {
        int productArr[] = new int[arr.length];
        Arrays.fill(productArr, 1);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    productArr[i] *= arr[j];
                }
            }

            // this is my self tried method
            // int product = 1;
            // for (int j = i+1; j< arr.length; j++){
            //         productArr[i] *= arr[j];
            // }
            // if(i > 0){
            //     for (int k=0; k< i; k++){
            //         product = product * arr[k];
            //     }
            // }

            // productArr[i] = product;
        }

        return productArr;
    }
}