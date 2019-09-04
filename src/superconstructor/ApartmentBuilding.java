package superconstructor;

/** Write a constructor for ApartmentBuilding that accepts three parameters: an Address and an integer
 to be passed up to the Building constructor, and an integer used to initialize the totalUnits instance variable.
        *
*/
 public class ApartmentBuilding extends Building{

    private int totalUnits;

    public ApartmentBuilding(String address, int sqFt, int totalUnits){

        super(address, sqFt);
        this.totalUnits = totalUnits;
    }

}
