package trycatch;

public class MainException {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;


        //System.out.println(answer);

        //System.out.println("does something");

        try{
            int answer = num1/num2;

        }catch (ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("number 2 is a zero, plz enter non zero number");
        }finally {
            System.out.println("does something");
        }

    }
}
