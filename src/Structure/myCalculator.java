package Structure;

public class myCalculator {

    public int addition (int a, int b){
        int total = 0;
        total = a + b;
        return total;
    }

    public void additionNoReturn (int a, int b){
        int total = 0;
        total = a + b;
        System.out.println(total);
    }

    public int substraction(int a, int b){
        int total = 0;
        total = a - b;
        return total;
    }
}
