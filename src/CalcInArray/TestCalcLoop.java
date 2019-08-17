package CalcInArray;

import java.util.Scanner;

public class TestCalcLoop {

    public static void main(String [] args){

        // array it is bucket
        int[] a = new int[20];
        Scanner myInput = new Scanner(System.in);

        System.out.println("How many numbers you want to add :");
        int maxInput = myInput.nextInt();

        for (int i=0; i< maxInput; i++) {
            System.out.println("Enter Number [" + i+ "]:");
            a[i] = myInput.nextInt();
        }

        myArrayCalc cal = new myArrayCalc();
        int finalTotal = cal.addtion(a, maxInput);
        System.out.println(" total sum value is :" + finalTotal);


    }
}
