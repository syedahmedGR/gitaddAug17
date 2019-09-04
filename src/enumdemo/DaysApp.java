package enumdemo;

public class DaysApp {

    public boolean canStudentStudyOnGivenDay(Days day){

        boolean canStudyOnThatDay = false;
        switch (day){

            case SUNDAY:
                canStudyOnThatDay = false;
                break;
            case MONDAY:
                canStudyOnThatDay = false;
                break;

            case TUESDAY:
                canStudyOnThatDay = false;
                break;

            case WEDNESDAY:
                canStudyOnThatDay = false;
                break;

            case THURSDAY:
                canStudyOnThatDay = false;
                break;

            case FRIDAY:
                canStudyOnThatDay = false;
                break;

            case SATURDAY:
                canStudyOnThatDay = false;
                break;
        }
        return canStudyOnThatDay;
    }

    public static void main(String[] args) {
        System.out.println(Days.FRIDAY);
    }
}
