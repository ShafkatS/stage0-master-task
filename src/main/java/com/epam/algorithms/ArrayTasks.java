package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
    
    
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int [] num = new int[length];
        for (int i = 0; i < length; i++) {
            num[i] = i+1;
        }
        return num;
    }

    
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }
    
    public int[] getOnlyPositiveNumbers(int[] arr){
        int size = 0;
        for (int k : arr) {
            if (k > 0) {
                size++;
            }
        }
        int[] positiveNumArr = new int[size];
        int j = 0;
        for (int k : arr) {
            if (k > 0) {
                positiveNumArr[j] = k;
                j++;
            }
        }

        return positiveNumArr;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] newArr = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
       int temp;
        boolean k = true;

        for (int i = 0; i < arr.length; i++) {
            while (k) {
                k = false;
                for (int j = 0; j < arr[i].length - 1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = temp;
                        k = true;
                    }
                }
            }
            k = true;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1].length > arr[j].length) {
                    int[] tempArr = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tempArr;
                }
            }
        }

        return arr;
    }

}
