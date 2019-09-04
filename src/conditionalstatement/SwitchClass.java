package conditionalstatement;

public class SwitchClass {


    public static void main(String[] args) {

        //String monthNumber= "Hello";
        //
        //name.toLowerCase();


        int monthNumber = 2;
        switch(monthNumber) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println(" Month is May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("september");
                break;
            default:
                System.out.println("no month input");
                break;
        }
    }
}
