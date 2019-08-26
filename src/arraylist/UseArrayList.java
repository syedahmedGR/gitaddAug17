package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("NJ");
        list.add("PA");

        // to access or print out the we use the for loop
        // primitive type
        /*
        for (int i=0; i< list.size(); i++) {
            System.out.println(list.get(i));

        }*/
        // but more efficient java 1.2
        /*
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }*/
        // more efficient of traversing the each element
        // java 1.5
        for ( String st: list){
            System.out.println(st);
        }
    }
}
