package seriesprac;

public class Fibonacci {

    public static void main(String[] args) {

        int maxNum = 15, first=0, next=0;
        //int[] arr ={0,1,1,2,3,5,8,13,21,34, };
        int[] arr = new int[20];
        arr[0]=0; arr[1]=1;
        System.out.println("My Fibonacci series....");
        System.out.println("========================");
        System.out.print(arr[0] + " ");
        for( int i =1; i < maxNum; i++){
            arr[i+1] = arr[i-1] + arr[i];
            System.out.print(arr[i]+ " " );

        }



    }
}
