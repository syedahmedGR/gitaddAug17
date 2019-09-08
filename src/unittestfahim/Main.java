package unittestfahim;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(20,5);
        System.out.println(calculator.add(20,5));  // should print out 25
        System.out.println( calculator.substract(20,10));
        System.out.println( calculator.multiply(20,4));
        System.out.println( calculator.divide(40,5) );


    }
}
