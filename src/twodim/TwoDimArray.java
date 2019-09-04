package twodim;

import java.util.Scanner;

public class TwoDimArray {

    public static void main(String[] args) {

        int [][] a2d = new int[5][3];
        //Scanner stdin = new Scanner();

        //System.out.println("Enter row num");
        System.out.println(a2d.length);
        System.out.println(a2d[0].length);
        boolean isRectangular = true;
        for ( int i=0; i < a2d.length; i++) {
            if (a2d[0].length != a2d[i].length) {
                isRectangular = false;
                System.out.println(isRectangular);
            }
            System.out.println("row -" + i + ":"+isRectangular);
        }
    }
}
