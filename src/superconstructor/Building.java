package superconstructor;

/**
 * Assume the existence of a Building class with a constructor that accepts two parameters: a reference to an Address object representing
 * the building's address, and an integer for the square footage of the building. Assume a subclass ApartmentBuilding has been defined with a
 * single integer instance variable, totalUnits. Write a constructor for ApartmentBuilding that accepts three parameters: an Address and an integer
 * to be passed up to the Building constructor, and an integer used to initialize the totalUnits instance variable.
 *
 * //@param <Address>
 */

public class Building {

    private  String address;
    private  int sqFt;

    public Building(String address, int sqFt) {
        this.address = address;
        this.sqFt = sqFt;
    }
}
