package forloopdemo;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        // this is a demo for loop
        for (int i=0 ; i< 10; i++){
            System.out.println("" +
                    "Number is :" + i);
        }

        //Scanner in = new Scanner(System.in);
        String str1 = "hello world";
        //str1.substring(str1.indexOf("lo"), 4);
        //str1.eq
        String tempstr = str1.split(" ")[0];
        System.out.println(tempstr); // split the first word
        System.out.println(str1.substring(0,2));
        System.out.println( str1.split("lo")[0] );

        System.out.println( str1.charAt(str1.length()-1) );
        //int str2 = str1.indexOf(str1);
        //System.out.println(str2);

        /*
        Assume that word is a variable of type String that has been assigned a value. Assume furthermore that this value always contains the letters "dr" followed by at least two other letters. For example: "undramatic", "dreck", "android", "no-drip".

        Assume that there is another variable declared, drWord, also of type String. Write the statements needed so that the 4-character substring word of the value of word starting with "dr" is assigned to drWord. So, if the value of word were "George slew the dragon" your code would assign the value "drag" to drWord.
        drWord = word.substring(word.indexOf("dr"), word.indexOf("dr") +4);
        or
        String word = "George slew the dragon";
        int pos = word.indexOf("dr");
        String drWord = word.substring(pos, pos+4);
        */
    }
}
