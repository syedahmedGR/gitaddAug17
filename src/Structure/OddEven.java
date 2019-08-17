package Structure;
// package/import lib
import java.util.*;
/// starting class
public class OddEven {

    // main method
    public static void main(String args[])
    {
        // variables
        // 8 primitive data types
        // short, int, long , byte
        // float, double
        // char, boolean

        int x=0;  //primitive integer type data
        // or

        // this line code display the msg asking the user to take input
        System.out.println("Enter an integer to check if it is odd or even");

        Scanner in = new Scanner(System.in);
        x = in.nextInt();


    // conditional statements starts
        // if else
        // if (condition)
        // modulas op statisfies whether it is divisible or not and then 0 is the reminder
        if (x % 2 == 0) {
            System.out.println("The number is even.");
        }
        else
            System.out.println("The number is odd.");
    }
}
