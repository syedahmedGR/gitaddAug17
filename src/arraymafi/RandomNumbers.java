package arraymafi;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        int [] studentId = new int[10];

        // take input using random no generation
        Random random=  new Random(100);
        for( int i=0; i< studentId.length; i++){
            studentId[i] = random.nextInt(20);
        }

        // output
        for( int i=0; i< studentId.length; i++){
            System.out.println( "Your student id" + "["+ (i+1) + "]:" + studentId[i] );
        }
    }
}
