package keywords;

public class Calculator {
    public static void main(String[] args) {
        int number = 10;
        try {
            int result = 10 / 0; //
            System.out.println(result);
        } catch (Exception ex){
            System.out.println("You cannot divide a number by zero !");
            //ex.printStackTrace();
        }
        System.out.println("you made it...");


    }

}
