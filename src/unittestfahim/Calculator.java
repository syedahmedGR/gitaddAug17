package unittestfahim;

/*
   This is a calculator class that contains all basic operational method such as
   add, substracting, multiplying and dividing
 */
public class Calculator {

    private int num1;
    private int num2;


    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2= num2;
    }
    /**
     * Add two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of two number
     */
    public static int add(int num1, int num2){
        return num1+num2;
    }
     /**
     * Add two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the substract of two number
     */

    public static int substract(int num1, int num2){
        return num1-num2;
    }
    /**
     * Add two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the multiply of two number
     */
    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    /**
     * Add two numbers
     * @param num1 the first number
     * @param num2 the second number
     * @return the divide of two number
     */
    public static int divide(int num1, int num2){
        return num1/num2;
    }
}
