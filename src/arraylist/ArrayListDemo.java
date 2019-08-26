package arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Fahim");
        arrayList.add("Joe");
        arrayList.add("Bob");

        System.out.println(arrayList.get(1));

        arrayList.remove(arrayList.indexOf("Joe"));
        System.out.println(arrayList.get(1));

    }
}
