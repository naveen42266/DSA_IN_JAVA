import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef

{
    public static void main(String[] args) throws java.lang.Exception
    {

        // your code goes here

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println(Arrays.toString(prefixSum(arr)));
        System.out.println(subArraySum(k, arr));
        System.out.println(longestSubArray(k, arr));
        System.out.println(buyAndSellStocks(arr));
        System.out.println(trappingRainWater(arr));

    }

    // prifix sum
    static int[] prefixSum(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i + 1] = arr[i] + arr[i + 1];

        }

        return arr;

    }

    // Subarray sum = k
    static int subArraySum(int k, int arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == k) {

                    count++;

                }

            }

        }

        return count;

    }

    // Longest subarray with sum k
    static int longestSubArray(int k, int arr[]) {
        int count = 1;

        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (currentSum + arr[i] <= k) {

                currentSum = arr[i];

                count++;

            } else if (currentSum + arr[i] > k) {

                currentSum = 0;

                count = 0;

            }

        }

        return count;

    }

    // Best time to buy & sell stock
    static String buyAndSellStocks(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return "Buy Stocks on $" + arr[0] + " and Sell on $" + arr[arr.length - 1];

    }

    // Trapping rain water (intuition based)
    static int trappingRainWater(int arr[]) {

        if (arr.length <= 2)
            return 0;
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int left = 0, right = 0;

            for (int k = i; k >= 0; k--) {
                left = Math.max(arr[k], left);
            }
            for (int j = i; j < arr.length; j++) {
                right = Math.max(arr[j], right);
            }

            trappedWater = trappedWater + Math.min(left, right) - arr[i];

        }

        return trappedWater;

    }

}