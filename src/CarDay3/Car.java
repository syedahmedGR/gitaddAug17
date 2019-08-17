package CarDay3;

public class Car {

    /*
    ifgpsjsfljfjj ldsls  /*
     */

    /**
     *
     */
    //
    // declaring the variables
    String brand;
    String model = null;
    int year;
    double price;
    boolean isUsed;

    // default contructor
    public Car() {

        this.brand = "Honda";
        this.model = "Accord";
        this.year = 2019;
        this.price = 30000.00;
        this.isUsed = false;
    }

    // constructor 2
    public Car(String brand, String model, int year) {
        this.brand = "Toyota";
        this.model = "Camry";
    }

    // constructor 3
    public Car(String brand, String model, int year, double price, boolean isUsed) {

        this.brand = "Acura";
        this.model = "MDX";
        this.year = 2019;
        this.price = 50000.00;
        this.isUsed = false;
    }
//---------------constructors finished

    // Method ( get & set)
    public String getBrand() {
        return this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    double setPrice(double price, int noOfInstallment, double interestRate) {
        //this.price = price;
        if (noOfInstallment == 60)
            this.price = price + interestRate * price;
        else if (noOfInstallment == 48)
            this.price = price + interestRate;
        else
            System.out.println(this.price);

        return this.price;
    }


// end of getter & setter

// your other methods

}



