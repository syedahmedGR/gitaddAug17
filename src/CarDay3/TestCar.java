package CarDay3;

public class TestCar {

    // start main method
    public static void main(String[] args) {

        // declaring the object instances :
        Car merc = new Car("marcendez", "G55", 2019);
        System.out.println();

        Car bmw = new  Car("bmw", "X6", 2019, 120000.00, false);
        System.out.println(bmw.model);

        Car audi = new  Car();
        System.out.println(audi.brand);

         merc.setBrand("x6");
        System.out.println(merc.brand);

        Car myCar = new Car();
        System.out.println(myCar.brand);
        //myCar.setCarDetails();
        //myCar.getCarDetails();



    }
}
