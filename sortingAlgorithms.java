import java.util.*;

import java.lang.*;

import java.io.*;

class Codechef

{

    public static void main(String[] args) throws java.lang.Exception

    {

        // your code goes here

        int[] arr = {
            70,
            30,
            50,
            10
        };

        System.out.println(Arrays.toString(arr));

          System.out.println(Arrays.toString(selectionSort(arr)));

        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));

        System.out.println(Arrays.toString(insertionSort(arr)));

         System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));

        mergeSort(arr, 0, arr.length - 1);

    }

    static int[] selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume the current position holds

            // the minimum element

            int min_idx = i;

            // Iterate through the unsorted portion

            // to find the actual minimum

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min_idx]) {

                    // System.out.println((arr[j] < arr[min_idx]) + " "+ arr[j] + " " +arr[min_idx]);

                    // Update min_idx if a smaller element

                    // is found

                    min_idx = j;

                    System.out.println("min_idx is " + min_idx);

                }

            }

            // Move minimum element to its

            // correct position

            int temp = arr[i];

            arr[i] = arr[min_idx];

            arr[min_idx] = temp;

            System.out.println("swapping between index is " + i + " " + min_idx);

        }

        return arr;

    }

    static int[] bubbleSort(int arr[], int n) {

        int i, j, temp;

        boolean swapped;

        for (i = 0; i < n - 1; i++) {

            swapped = false;

            for (j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    System.out.println(arr[j] + " " + arr[j + 1] + " " + (arr[j] > arr[j + 1]));

                    // Swap arr[j] and arr[j+1]

                    temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                    swapped = true;

                    System.out.println(Arrays.toString(arr));

                }

            }

            // If no two elements were

            // swapped by inner loop, then break

            if (swapped == false)

                break;

        }

        return arr;

    }

    static int[] insertionSort(int arr[]) {

        int n = arr.length;

        for (int i = 1; i < n - 1; ++i) {

            int key = arr[i];

            int j = i - 1;

            /* Move elements of arr[0..i-1], that are

              greater than key, to one position ahead

              of their current position */

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];

                j = j - 1;

                System.out.println(i + " " + j + " " + Arrays.toString(arr));

            }

            arr[j + 1] = key;

        }

        System.out.println(Arrays.toString(arr));

        return arr;

    }

    static void mergeSort(int arr[], int l, int r) {

        if (l < r) {

            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    static void merge(int arr[], int l, int m, int r) {

        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }


        System.out.println(Arrays.toString(arr));
    }

}