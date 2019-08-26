package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListHW {
    /* Create a prog that user for their first name, last name and age
     store info print out all user name and age
     user name and age.
*/
    // - Incorporate scanner : ask the number of input/users
    // - ArrayList

    /*  Procedure to execute the program
      for loop
     inside each for loop, you are gonna need to the user for
     first name, last name and age
     then gonna create a user object for these 3 values
     then store the user object into the ArrayList<User>
    then print user first name, last name and age
     */

    public static void1{

        // takes input for getting Maximum number of user
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter the number of user...");
        int maxUserNum = stdin.nextInt();

        // create a user Array List...
        ArrayList<User> userArrayList = new ArrayList<>();

        // take input firstname, lastname and age
        // store in the class object
        for (int i=0; i<maxUserNum; i++){
            // input for users name & age

            System.out.println("Enter First Name : " + " of User [" + i+1 + "]" );
            String fname = stdin.next(); // string input

            System.out.println("Enter Last Name : " + " of User [" + i+1 + "]" );
            String lname = stdin.next(); // string input

            System.out.println("Enter Age : " + " of User [" + i+1 + "]" );
            int age  = stdin.nextInt(); // integer input

            User user = new User(fname, lname, age); // initialize through constructor

            userArrayList.add(i, user) ; // assign the class object to the userArrayList

        }
        // display user info to the output
        for (int i=0; i< maxUserNum; i++){
            System.out.println(" User[" + i+1 + ']' + " First Name " +   userArrayList.get(i).getFirstName());
            System.out.println( " User[" + i+1 + ']' + " Last Name " +  userArrayList.get(i).getLastName());
            System.out.println( " User[" + i+1 + ']' + " Age " + userArrayList.get(i).getAge());
        }

    }
}
