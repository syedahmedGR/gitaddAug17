package stackdemo;

import java.util.HashMap;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();
        map.put("USA", "NY");
        map.put("Canada", "Toronto");
        map.put("Bangldesh", "Dhaka");
        map.put("Japan", "Tokoyo");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }
}
