package seriesprac;

public class PrimeNo {
    public static void main(String[] args) {

        int inputNum = 33;
        boolean flag= false;
        // prime number divisible by 2,3, ... upto n-1

        for (int i=2; i <inputNum; i++) {
            if (inputNum % i == 0) flag = true;
        }
        if (flag==true) System.out.println("not prime number");
        else System.out.println(" prime number");

    }
}
