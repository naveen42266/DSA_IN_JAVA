import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int inputs = sc.nextInt();

        int[] arr = new int[inputs];

        for (int i = 0; i < inputs; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("The Second Largest Number is :" + secondLargest(arr));

        System.out.println(sortedOrNot(arr));

        rotateByK(arr, k);
        printArray(arr);

        moveAllZeroToEnd(arr);
        printArray(arr);

        System.out.println("The Output is :"+linearSearch(arr, k));


        System.out.println(rotateByK(arr, k));
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static int secondLargest(int[] arr) {

        // int secondLargest = 0;
        // int max = 0;

        // int odd = arr.length % 2;

        // for (int i = 0; i < arr.length / 2; i++) {

        //     if (arr[i] > arr[arr.length - 1 - i] && arr[i] > secondLargest) {
        //         secondLargest = max;
        //         max = arr[i];
        //     }
        //     else if(arr[arr.length - 1 - i] > secondLargest) {
        //         secondLargest = max;
        //         max = arr[arr.length - 1 - i];
        //     }

        // }

        // if (odd != 0 && arr[(arr.length / 2) + 1] > max && arr[(arr.length / 2) + 1] > secondLargest) {
        //     secondLargest = max;
        //     max = arr[(arr.length / 2) + 1];
        // }

        // return secondLargest;



        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             // Swap arr[j] and arr[j+1]
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }

        // System.out.println(Arrays.toString(arr));

        // return arr[arr.length - 2];

        //optimized approach

         int max = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;


    for (int num : arr) {
        if (num > max) {
            second = max;
            max = num;
        } else if (num > second && num != max) {
            second = num;
        }
    }
    return second;
    }

    static String sortedOrNot(int[] arr) {

        // char order = '\0';
        // boolean sorted = false;

        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i + 1]) {
        //         if (order != 'a') {
        //             order = 'd';
        //         }
        //         else {
        //             return "Array is Not Sorted";
        //         }
        //     }
        //     else if (arr[arr.length - 2 - i] < arr[arr.length - 1 - i]) {
        //         if (order != 'd') {
        //             order = 'a';
        //         }
        //         else {
        //             return "Array is Not Sorted";
        //         }
        //     }
        //     else {
        //         return "Array is Not Sorted";
        //     }
        // }

        // return order == 'a' ? "Array is Sorted in Ascending order" : "Array is Sorted in Descending order";

        //optimized

        boolean asc = true, desc = true;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) asc = false;
        if (arr[i] < arr[i + 1]) desc = false;
    }

    if (asc) return "Array is Sorted in Ascending order";
    if (desc) return "Array is Sorted in Descending order";
    return "Array is Not Sorted";
    }

    static void rotateByK(int[] arr, int k) {
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);


    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }

    static void moveAllZeroToEnd(int[] arr) {

        // int count = 0;

        // for (int i = 0; i < (count == 0 ? 1 : count); i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] == 0 && arr[j + 1] != 0) {
        //             if (i == 0 && j == 0 && arr[i] == 0) {
        //                 count += 1;
        //             } else if (i == 0) {
        //                 count += 1;
        //             }
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = 0;
        //         }

        //     }
        // }

        //optimised

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    static int linearSearch(int[] arr ,int k){
    //   int index = -1;
    //   for(int i = 0; i < arr.length - 1; i++){ 
    //       if(arr[i] == k){ 
    //           index = i;
    //           return i;
    //           } 
    //           else if(arr[i+1] == k){
    //               index = i+1;
    //               return i+1;
    //               } 
    //   } 
    //   return index; 

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }

        return -1;

    }
}