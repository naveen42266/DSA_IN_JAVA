import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef

{

    // remove duplicate in array

    // public static void main(String[] args) throws java.lang.Exception

    // {

    //     // first answer

    //     Scanner sc = new Scanner(System.in);

    //     int count = sc.nextInt();

    //     Set < Integer > set = new LinkedHashSet < Integer > ();

    //     for (int i = 0; i < count; i++) {

    //         set.add(sc.nextInt);

    //     }

    //     System.out.println(set);

    //     // second answer

    //     Scanner sc = new Scanner(System.in);

    //     int count = sc.nextInt();

    //     int array[] = new int[count];

    //     for (int i = 0; i < count; i++) {

    //         array[i] = sc.nextInt();

    //     }

    //     Set < Integer > set = new LinkedHashSet < Integer > ();

    //     for (int i = 0; i < count; i++) {

    //         set.add(array[i]);

    //     }

    //     System.out.println(set);


    // }

    // find missing number

    // public static void main(String[] args) throws java.lang.Exception

    // {

    //     Scanner sc = new Scanner(System.in);
    //     int count = sc.nextInt();
    //     int n = count + 1;
    //     int actualSum = 0;
    //     int expectedSum = n * (n + 1) / 2;

    //     for (int i = 0; i < count; i++) {
    //         actualSum += sc.nextInt();
    //     }


    //     // for (int i = 0; i < arr.length -1; i++) {

    //     // if (arr[i] + 1 == arr[i + 1]) {

    //     //     // System.out.println(arr[i] + " "+arr[i+1]);

    //     // }

    //     // else{

    //     //     System.out.println("Missing number between "+arr[i]+ " and " + arr[i+1] +" is "+ (arr[i]+1));

    //     // }

    //     // }

    //     System.out.println(expectedSum - actualSum);

    // }

    // maximum element
    // public static void main(String[] args) throws java.lang.Exception
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int arr[] = new int[n];

    //     for (int i = 0; i < n; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     int count = 0, cadidate = -1;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (count == 0) {
    //             cadidate = arr[i];
    //             count = 1;
    //         }
    //         else {
    //             if (arr[i] == cadidate) {
    //                 count++;
    //             }
    //             else {
    //                 count--;
    //             }
    //         }
    //     }

    //     count = 0;

    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] == cadidate) {
    //             count++;
    //         }
    //         if (count > (arr.length / 2)) {
    //             System.out.println("Majority element is " + cadidate);
    //         }

    //     }


    // }


    // kadane's algorithm Maximum Subarray Sum
    // public static void main(String[] args) throws java.lang.Exception
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int count = sc.nextInt();
    //     int arr[] = new int[count];
    //     int currentSum = arr[0], maxSum = arr[0];

    //     for(int i =0; i< arr.length; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     for(int i=0; i< arr.length; i++){
    //         // format 1
    //         currentSum = Math.max(arr[i], currentSum+arr[i]);
    //         maxSum = Math.max(maxSum, currentSum);

    //         // format 2
    //         // if(arr[i] > currentSum+arr[i]){
    //         //     currentSum = arr[i];
    //         // }else {
    //         //     currentSum = currentSum+arr[i];
    //         // }
    //         // if(currentSum > maxSum){
    //         //     maxSum = currentSum;
    //         // }
    //     }


    //     System.out.println(maxSum);
    // }

    // two sum brute force
    // public static void main(String[] args) throws java.lang.Exception
    // {
    //     Scanner sc = new Scanner(System.in);
    //     int count = sc.nextInt();
    //     int target = sc.nextInt();
    //     int arr[] = new int[count];

    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = sc.nextInt();
    //     }

    //     System.out.println("Two sum brute force :" + Arrays.toString(twoSum(arr, target)));

    // }

    // public static int[] twoSum(int[] arr, int target) {

    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[i] + arr[j] == target) {
    //                 return new int[] {
    //                     arr[i], arr[j]
    //                 };
    //             }
    //         }
    //     }

    //     return new int[] {};

    // }

}