package classnobjectday3;

public class TestPizza {

    public static void main(String[] args) {

        Pizza myPizza = new Pizza();

        myPizza.receiveOrderPizza(myPizza.toppings, myPizza.size );
        double myPrice= myPizza.getPricePizza(10.99);
        System.out.println(myPrice);

        // new ref obj variable using default constructor
        Pizza fahimPizza = new Pizza();
        System.out.println(fahimPizza.pizzaType);

        // new ref obj variable using 5 param passing constructor
        Pizza  noorsPizza = new Pizza("Thin Crust", 'X', 11.99, "Chicken", false, true );
        System.out.println(noorsPizza.pizzaType);
        System.out.println(noorsPizza.size);
        System.out.println(noorsPizza.price);
        System.out.println(noorsPizza.toppings);
        System.out.println(noorsPizza.isHaram);
        System.out.println(noorsPizza.isDelicious);

        // new ref obj variable using  constructor using 2 param
        Pizza syedPizza = new Pizza('M', "Beef");
        System.out.println(syedPizza.size);
        System.out.println(syedPizza.toppings);
        System.out.println(syedPizza.price); // its going to print

        //Pizza jhonsPizza = new Pizza()



        myPizza.deliverPizza();

    }
}

