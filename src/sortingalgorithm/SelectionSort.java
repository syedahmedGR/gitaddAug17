package sortingalgorithm;

public class SelectionSort {

    public static void main(String[] args) {

    int arr[] = {64,25,12,22,11};
    int n = arr.length;

        System.out.println("Sorted array");

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
        // Find the minimum element in unsorted array
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_index])
                    min_index = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " " );
    }
}

