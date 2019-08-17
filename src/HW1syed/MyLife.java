package HW1syed;

import java.util.Scanner;

public class MyLife {

    String goal = null;

    int work; // in hrs
    int weekEndWk; // in hrs
    boolean shopping = false; //in hrs
    String sightSeeing = null ;



    public void setWeekDaysActivity(){
        work = 30;
    }

    public int getWeekendWk(int wk1, int wk2){
        return weekEndWk = wk1 + wk2;
    }

    public String getFamilyOuting(){
        System.out.println("Activity3: Family outing activities at least once in a month [plz enter]-");
        Scanner inp = new Scanner(System.in); // taking input from user
        sightSeeing = inp.next();
        return sightSeeing;
    }

    public void setShopping(boolean shopping){

        if (shopping==true)
            System.out.println("Activity4 :Shopping activities [grooceries] - yes");
        else
            System.out.println("Activity4 :Shopping activities [grooceries] - no");
    }

    public void setGoal(){
        goal = "Automation tester";


    }

}
