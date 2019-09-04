package jdbcdemo;
/**
 *  Author : SYED AHMED
 *  In future all hard coded value will be replaced by input
 *  URL, username and root password will be read from file
 *  This program will demonstrate  how to connect JDBC and mySQL in java
 *  It will execute all type of mySQL statement : insert, delete, update and Select
 *  A movie class has been defined and movie table in netflix database has been created in the back end
 *  It will take input from the user of movies information like id, title, year of release, genre, MPAA rating
 *  It will store in movie object instance through constructor
 *  Replace the information to dynamic ArrayList
 *  The program uses switch statement to take choice from the user
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertMovieDemo {

    public static void main(String[] args) throws SQLException {

        // 1. Create connection

        // initialize the variable for connection
        String url = "jdbc:mysql://localhost:3306/netflix?serverTimezone=UTC";
        String user = "root";
        String password = "root1234";
        Connection connection= null;
        Statement statement = null;

        // initialize variable to take input
        int id;
        String title;
        int releaseYear;
        String genre;
        String mpaaRating;

        // take input by scanner class
        Scanner stdin = new Scanner(System.in);
        // declaring ArrayList <- replace object instance
        ArrayList<Movie> movieArrayList = new ArrayList<>();


        try{
             connection = DriverManager.getConnection(url, user, password);
            // 2. Create a statement
             statement = connection.createStatement();

             // taking choice [INSERT, DELETE AND UPDATE] from user
            System.out.println("Enter the choice [For Insert:1, Delete:2, Update:3] - " );
            int opt = stdin.nextInt();

            // executing the switch statement to invoke choice
             switch (opt) {
                 case 1:
                     // prompting number of movies to be inserted
                     System.out.println("Enter number of movies you want to insert...");
                     int maxMovieNum = stdin.nextInt();

                     for (int i =0; i<maxMovieNum; i++ ){
                         System.out.println("Enter the information of Movie: " + (i+1) );
                         System.out.println("=====================================");

                         System.out.println("Enter the movie id : ");
                         id= stdin.nextInt();
                         stdin.nextLine(); // invoking another line to take string of words/sentence as input

                         System.out.println("Enter the title : ");
                         title = stdin.nextLine();

                         System.out.println("Enter the year of Release :");
                         releaseYear = stdin.nextInt();

                         System.out.println("Enter the genre :");
                         genre = stdin.next();

                         System.out.println("Enter the MPAA Rating :");
                         mpaaRating = stdin.next();

                         // creating user instance and inserting the values by initializing constructor
                         Movie movie = new Movie(id, title, releaseYear, genre, mpaaRating );
                         movieArrayList.add(i, movie); // storing to the ArrayList from the object instance
                     }

                     // traversing from 0 index to last index of ArrayList for inserting values
                     for (Movie mv : movieArrayList) {
                         String query = "insert into movie (id, title, release_year, genre, mpaa_rating) " +
                                 "values(" + mv.getId() + ",'" + mv.getTitle() + "'," + mv.getReleaseYear() + ",'" +
                                 mv.getGenre() + "','" + mv.getMpaaRating() + "'" + ")";

                         // 3. Excute the SQL query
                         statement.execute(query);
                     }
                     break;

                 case 2:
                     // excuting the delete option asking the id no from the user...
                     // executing SQL DELETE
                     System.out.println("Enter the id no for delete : ");
                     int deleteID = stdin.nextInt();
                    String deleteSQL ="delete from movie where id = " + deleteID;
                    statement.executeUpdate(deleteSQL);
                    break;

                 case 3:
                     // code to execute UPDATE SQL command
                     System.out.println("Enter the id no for updating : ");
                     int updateID = stdin.nextInt();

                     stdin.nextLine(); // allowing to go to the next line and take a sentence of string input
                     System.out.println("Enter the title for updating : ");
                     String updatetitle = stdin.nextLine();

                     String updateSQL = "update movie set title = '" + updatetitle + "' where id = " + updateID;
                     statement.executeUpdate(updateSQL);
                     break;


                 default:
                     System.out.println("not a valid input.. ");
                     break;
             }

             // 4. Process result set (if necessary)
            //  excuting SQL SELECT STATEMENT
            // checking all INSERT, UPDATE AND DELETE has been executed properly or not

            String sql = "select * from movie";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println("Id: " + rs.getInt("id") +
                        ", Title: " + rs.getString("title") +
                        ", year of release: " + rs.getInt("release_year") +
                        ", genre: " + rs.getString("genre") +
                        ", MPAA rating: " + rs.getString("mpaa_rating"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }  finally {
            statement.close();
            connection.close();
        }

    }
}
