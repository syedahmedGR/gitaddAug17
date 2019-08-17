package Structure;

import java.util.Scanner;

public class TestCalc {

    public static void main(String [] args){

        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = myInput.nextInt();

        System.out.println("Enter 2nd Number");
        int n2 = myInput.nextInt();

        myCalculator cal = new myCalculator();
        System.out.println("Addition : " + cal.addition(n1, n2));

        System.out.print("Addition No return :");
        cal.additionNoReturn(n1, 45);

        System.out.println("Substraction : " + cal.substraction(n1, n2));

    }
}
