package sortingalgorithm;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array =  {10, 7, 4, 15, 3};

        for( int i=1; i< array.length; i++){

            int j=i-1;
            int point = array[i];
            while(j>=0 && array[j]> point){
                array[j+1] = array [j];
                j=j-1;
            }
            array[j+1] = point;
        }

        for( int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }

    }
}
