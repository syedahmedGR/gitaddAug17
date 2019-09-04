package Welcome;

import inheritance.oop.University;

public class StringDemo {

    public static void main(String[] args) {

        int x= 0;
        char c1='C';
        char c2 = '9';


        String str1 = "Hello";
        String str2 = "world";
        String str3 = "First Class";

        System.out.println(str1 + str2);
        String str4= str1.substring(0,1); // substring(int beginindex, int endindex)

        System.out.println(" Char values are ...: " + c1 + " " + c2);
        System.out.println(str3);

        System.out.println("Part of the word Hello : "  + str4);

        String strCheck= "Your transaction is done successfully";

        // finding the char at particular position
        System.out.println(strCheck.charAt((5))); // finding 5th char
        //System.out.println(strCheck.charAt((37))); // StringIndexOutOfBoundException

        System.out.println(strCheck.indexOf("r")); // 1st occurance of finding char 'r' in the strCheck
        System.out.println(strCheck.indexOf("r", strCheck.indexOf("r")+1)); // 2nd occurance of r

        String  username = "welcome Tom";
        int z=178;
        username = z + username;
        System.out.println(username);

        if(str1.equalsIgnoreCase(str2)) // if (str1.equals(str2))
            System.out.println("Similar string");
        else
            System.out.println("not similar string");

        if ( username.indexOf("Tom")>0)
                System.out.println("Pass");
        else
            System.out.println("Fail");

        // contains
        String name="Face Book";
        if(name.contains("Face"))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        // split
        String employeeData = "Tom-25-male-InfoSys-PA-QALead";
        String  emp[] = employeeData.split("-");

        String newDate = "08-01-2019";
        System.out.println(newDate.replace("-", "/"));

        // data conversion
        // String to int
        String s ="100";
        System.out.println(s+20); // concatenate 10020

        int i = Integer.parseInt(s);
        System.out.println(i+20); // 120

        String h = "12.33";
        System.out.println(Double.parseDouble(h)+20);

        String s1 = "Syed", s2 = "Muzakkir";
        // comparing length
        if (s1.length() > s2.length())
            System.out.println("bigger : " + s1);
        else System.out.println("bigger :" +  s2);
        // comparing lexicographically
        if (s1.compareTo(s2) > 0)
            System.out.println("bigger : " + s1);
        else System.out.println("bigger :" + s2);
    }
}
