package HW1syed;

public class RunMyLife {

    public static void main(String[] args) {

        MyLife myLife = new MyLife();

        myLife.setWeekDaysActivity(); // no returns no param
        System.out.println("Activity1: Weekdays work at least -" + myLife.work + "hrs");

        int wk1=2, wk2=1; // in hrs
        myLife.weekEndWk = myLife.getWeekendWk(wk1, wk2); // returns with two param passing
        System.out.println("Activity2: Home making work + kids activities [total - " + myLife.weekEndWk + "hrs");

        String familyOut = myLife.getFamilyOuting(); // returns with no param
        System.out.println("Activity3: Family outing was - " + familyOut);

        myLife.shopping= true;
        myLife.setShopping(myLife.shopping); // no returns with boolean param passing

        myLife.setGoal(); // no returns no param passing
        System.out.println("Activity5: Study hard + Attend classes + Do home work " + " [ then Final goal] = " + myLife.goal);
    }
}
