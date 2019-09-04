package Welcome;

import java.sql.PreparedStatement;

public class StringCompare {

    public static void main(String[] args) {
        String result = min( "Syed ", "Muzakkir","Ahmed");
        System.out.println(result);
        System.out.println( getEmailUserName("nabil@psd.org"));
        System.out.println(getEmailDomain("nabilpsd.org"));
        String temp ="This is first line ....";
        //System.out.println(getSecondLine(temp));
    }

    public static String min ( String s1, String s2, String s3){
        String result ="";
        if ( s1.compareTo(s2) < 0 ){
            if ( s1.compareTo(s3) < 0 )
                result = s1;
        }
        else {
            if ( s2.compareTo(s3) < 0 )
                result = s2;
            else result = s3;
        }
        return result;
    }
    public static String getEmailUserName (String arg) {
        String result = "";
        int i = arg.indexOf("@");
        System.out.println(i);
        return result = arg.substring(0, i);
    }

    public static String getEmailDomain (String arg) {
        int i = arg.indexOf("@");
        System.out.println(i);
        if (i>=0) System.out.println("found");
        else System.out.println("not found");
        int j = arg.length();
        return arg.substring(i+1, j);
    }

    public  static boolean isEmailAddress(String str){
        if (str.contains("@")) {
            if (!str.contains(" ") || !str.contains("\n") || !str.contains("\t"))
                return true;
        }

        return false;
    }
    /* @param aString
     * @return

    public static String getSecondLine(String aString) {
        return aString.substring(aString.indexOf("\n") + 1,
                aString.indexOf("\n") + 1 + aString.substring(aString.indexOf("\n") + 1, aString.length()).indexOf("\n"));
    }*/

}
