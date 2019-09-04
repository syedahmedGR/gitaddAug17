package methoddemo;

public class MethodDemo {

    public static void main(String[] args) {
        int lower = getLowest(5, 11);
        System.out.println(lower);
    }

    public static int getLowest (int num1, int num2){

        if (num1 < num2)
            return num1;
        else return num2;
    }
}
