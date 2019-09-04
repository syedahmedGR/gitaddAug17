package staticdemofahim;

public class TestBall {

    public static void main(String[] args) {

        Ball basketBall = new Ball("Orange", "Large");
        Ball footBall = new Ball ("White and black", "Medium");
        Ball tennisBall = new Ball("Green", "Small");

        Ball myBall = new Ball();
        System.out.println((Ball.manufacturer));

        System.out.println(Ball.getNumBalls());








    }
}
