package List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkListPrac {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        list.add("Manhattan");
        list.add("Queens");
        list.add("Bronx");
        list.add("Brooklyn");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        list.remove("Queens");
        System.out.println("after removing print it..");
        //
        Iterator it2 = list.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
