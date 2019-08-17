package ClassNobject;
import Welcome.myOffice;

public class TestHouse {

    public static void main( String [] args){

        // class
        // properties : it is defined by variables
        // methods : actions or how it behaves or perform
        // object

        House myHouse = new House();
        myHouse.classRoom();
        myHouse.adminRoom();
        System.out.println(myHouse.houseName);
        System.out.println(myHouse.address);

        myOffice office = new myOffice();
        office.officeRoom();
    }

}
