package stackdemo;

import java.util.*;

public class LinkHashMap {

    public static void main(String[] args) {

        Map<String,List<String>> myMap = new HashMap<String,List<String>>();
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new ArrayList<>();

       myList1.add("Bercelona");
       myList1.add("RealMadrid");
       myList2.add("Manchester United");
       myList2.add("Bayern Munich");

       myMap.put("Spain", myList1);
       myMap.put("Spain", myList1);
       myMap.put("European", myList2);
       myMap.put("European", myList2);






        List<String > statesOfUSA = new ArrayList<String>();
        statesOfUSA.add("NY");
        statesOfUSA.add("NJ");
        statesOfUSA.add("PA");

        List<String> statesOfBangladesh = new ArrayList<String>();
        statesOfBangladesh.add("Dhaka");
        statesOfBangladesh.add("Sylhet");
        statesOfBangladesh.add("Manikganj");

        List<String>statesOfCanada = new ArrayList<String>();
        statesOfCanada.add("Vancouver");

        Map<String, List<String>> map = new HashMap<String , List<String>>();

        map.put("USA", statesOfUSA);
        map.put("Canada", statesOfCanada);
        map.put("Bangldesh", statesOfBangladesh);

        for (Map.Entry<String, List<String>> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
