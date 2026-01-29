// input
// 5
// 2 5 1 8 3 

// output
// Find a Maximum number: 8
// Sum of Array: 19
// Odd and Even number: Total Even numbers are 2 and Odd numbers are 3
// Array Reverse : [3, 8, 1, 5, 2]




import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Find a Maximum number: " + findMax(arr));
        System.out.println("Sum of Array: " + findSum(arr));
        System.out.println("Odd and Even number: " + findEvenOdd(arr));
        System.out.println("Array Reverse : " + Arrays.toString(reverseArr(arr)));

    }


    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    static int findSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    static String findEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        return "Total Even numbers are " + even + " and " + "Odd numbers are " + odd;
    }

    static int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;

        }

        return arr;
    }
}