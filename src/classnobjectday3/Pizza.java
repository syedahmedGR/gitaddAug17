package classnobjectday3;

public class Pizza {
// properties (STATE)
    String pizzaType;
    char size;
    double price;
    String toppings;
    boolean isHaram;
    boolean isDelicious;


    // constructor default
    public Pizza(){
        this.pizzaType ="Pan Pizza";
        this.size= 'L';
        this.price = 11.99;
        this.isHaram = false;
        this.isDelicious = true;
        this.toppings = "Mixed Vaggie";

    }

    public Pizza(boolean isHaram){
        this.isHaram = false;

    }

    public Pizza(boolean isHaram, char  size){
        this.isHaram = false;
        this.size ='S';

    }


    public Pizza(String pizzaType, char size, double price, String toppings, boolean isHaram, boolean isDelicious){

        this.pizzaType=pizzaType;
        this.size= size;
        this.price = price;
        this.isHaram = isHaram;
        this.isDelicious = isDelicious;
        this.toppings = toppings;

    }

    public Pizza(char size, String toppings){

        this.size= size;
        this.toppings = toppings;
    }


    public void receiveOrderPizza(String toppings, char size){
        System.out.println("Recieved order :" + size + "," + toppings);

    }

    public void eatPizza(){
        System.out.println("Eat pizza");
    }


    public double getPricePizza(double price){

        this.price = price;
        return  price;
    }
    public void deliverPizza(){
        System.out.println("Deliver");
    }

}
