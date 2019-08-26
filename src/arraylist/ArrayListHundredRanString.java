package arraylist;

import arraymafi.RandomNumbers;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListHundredRanString {

    // create an array list that contains 100 random strings

    public static void main(String[] args) {

        ArrayList <Integer> arrayListRandomString = new ArrayList<>();

        Random randomnum = new Random(10);

        try{
            for( int i=0; i< 100; i++){
                arrayListRandomString.add(randomnum.nextInt());
            }

            for( int i=0; i< 100; i++){
                System.out.println(arrayListRandomString.get(i));;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("\n For each loop");
        for (Integer num: arrayListRandomString){
            System.out.println(num);
        }
        /*

        for( Integer id: arrayListRandomString){
            arrayListRandomString.add(randomnum.nextInt(id));
        }

        for( Integer id : arrayListRandomString){
            System.out.println( "no" + id + arrayListRandomString.get(id));
        }

         */
    }
}
