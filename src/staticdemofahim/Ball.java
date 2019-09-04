package staticdemofahim;

public class Ball {

    private String color;
    private String type;
    static int numOfBall=0;
    public static String manufacturer ="Ball inc.";

    public Ball(){
        this.color= "blue";
        this.type ="regular";
        numOfBall++;
    }

    public Ball(String color, String type) {
        this.color = color;
        this.type = type;
        numOfBall++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getNumBalls(){
        return numOfBall;

    }
}
