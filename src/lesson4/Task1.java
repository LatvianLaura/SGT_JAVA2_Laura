package lesson4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {

        //First solution:
        /*
        System.out.println("Task 1 first solution:");

        int numArray[] = {1, 6, 88, 22, 4, 9, 50, 5, 12, 34, 6, 79, 4, 6, 34, 7, 79};
        Set<Integer> numSet = new TreeSet<>();
        // Converting the array into the TreeSet, which is sorted and doesn't have duplicates
        for (Integer num : numArray) {
            numSet.add(num);
        }
        int n = numSet.size();
        Integer arr[] = new Integer[n];
        // Converting the set back to an array, so we can access elements by its index
        arr = numSet.toArray(arr);
        // Getting the third max number if there is such
        if (arr.length >= 3) {
            System.out.println(arr[arr.length - 3]);
            // Getting the max number if the array size is smaller than 3
        } else {
            System.out.println(arr[arr.length - 1]);
        }


        // Second solution
        int[] nums = {2, 2, 3, 1};
        Arrays.sort(nums);
        Set<Integer> numSet = new TreeSet<>();
        for (Integer num : nums) {
            numSet.add(num);
        }
        Integer arr[] = new Integer[numSet.size()];
        arr = numSet.toArray(arr);
        int max = arr[0];
        int i;
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        if (arr.length < 3) {
            System.out.println(max);
        } else if (arr.length >= 3) {
            int thirdMax = nums[arr.length - 3];
            System.out.println(thirdMax);
        }
*/
        //Third solution
        int[] nums = {12, -45};
        int[] numsTwo = {-43, -67, -100, 43653658};
        int[] numsThree = {0, -100, -100, 43653658};
        getLargestNumber(nums, nums.length);
        getLargestNumber(numsTwo, numsTwo.length);
        getLargestNumber(numsThree, numsThree.length);
    }

    public static void getLargestNumber(int[] array, int arraySize) {
        if (arraySize < 3 && arraySize >= 1) {
            int max = array[0];
            int i;

            for (i = 1; i < array.length; i++) {
                if (array[i] > max)
                    max = array[i];
            }
            System.out.printf("The Largest element is %d\n", max);
        } else if (arraySize >= 3) {
            int max;
            for (int i = 0; i < arraySize; i++) {
                for (int j = i + 1; j < arraySize; j++) {
                    if (array[i] > array[j]) {
                        max = array[i];
                        array[i] = array[j];
                        array[j] = max;
                    }
                }
            }
            System.out.printf("The third largest element is %d\n", array[arraySize - 3]);
        }
    }
    }

