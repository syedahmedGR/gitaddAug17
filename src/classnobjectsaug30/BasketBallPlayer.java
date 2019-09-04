package classnobjectsaug30;


public class BasketBallPlayer {

    private String name;
    private int age;
    private String teamName;
    private int jerseyNumber;
    private String jerseyColors;
    private double salary;
    private boolean isVeteran;
    private String position;
    private boolean attendedCollege;
    private boolean above6ft5;
    private boolean isAthletic;

    public BasketBallPlayer(String name,
                            int age,
                            String teamName,
                            int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
    }

    public BasketBallPlayer(String name,
                            int age,
                            String teamName,
                            int jerseyNumber,
                            String jerseyColors,
                            double salary,
                            boolean isVeteran) {
        this.name = name;
        this.age = age;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
        this.jerseyColors = jerseyColors;
        this.salary = salary;
        this.isVeteran = isVeteran;
    }

    public BasketBallPlayer(String name,
                            int age,
                            String teamName,
                            int jerseyNumber,
                            String jerseyColors,
                            double salary,
                            boolean isVeteran,
                            String position,
                            boolean attendedCollege,
                            boolean above6ft5,
                            boolean isAthletic) {
        this.name = name;
        this.age = age;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
        this.jerseyColors = jerseyColors;
        this.salary = salary;
        this.isVeteran = isVeteran;
        this.position = position;
        this.attendedCollege = attendedCollege;
        this.above6ft5 = above6ft5;
        this.isAthletic = isAthletic;
    }

    public void dunkBall() {
        System.out.println("Player dunked the ball");
    }

    public void scoreBasket() {
        System.out.println("Player scored a basket");
    }

    public void runAcrossTheCourt() {
        System.out.println("Player is running across the court");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getJerseyColors() {
        return jerseyColors;
    }

    public void setJerseyColors(String jerseyColors) {
        this.jerseyColors = jerseyColors;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isVeteran() {
        return isVeteran;
    }

    public void setVeteran(boolean veteran) {
        isVeteran = veteran;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isAttendedCollege() {
        return attendedCollege;
    }

    public void setAttendedCollege(boolean attendedCollege) {
        this.attendedCollege = attendedCollege;
    }

    public boolean isAbove6ft5() {
        return above6ft5;
    }

    public void setAbove6ft5(boolean above6ft5) {
        this.above6ft5 = above6ft5;
    }

    public boolean isAthletic() {
        return isAthletic;
    }

    public void setAthletic(boolean athletic) {
        isAthletic = athletic;
    }
}