package sortingalgorithm;

import java.util.ArrayList;

public class SelectionSortFahim {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        // swap
        // int temp= num1;
        // num1 = num2;
        // num2 = temp

        int[] unsortedArray = {5, 1, 3, 7, 11, 1};
        selectionSort(unsortedArray);

        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.print(unsortedArray[i] + " ");
        }

    }

    public static void selectionSort(int[] array) {
        //int temp;
        for (int i = 0; i < array.length; i++) {
            int min = i; // setting minimal to i
            for (int j = i + 1; j < array.length; i++) {
                if (array[min] > array[j]) {
                    int temp = array[min];
                    array[min] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}

