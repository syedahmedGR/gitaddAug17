package demoforloop;

public class ForLoop {

    public static void main(String[] args) {

        for (int i=0; i< 10; i++){
            System.out.println("Hello world");
        }

        for (int j=1; j<= 100; j++){
            if ( j% 2 == 0)
            System.out.println( j  + " is even");
            else
                System.out.println(j + "is odd");
        }
    }
}
