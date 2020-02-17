import java.util.ArrayList;

public class CoffeeApp {

   public ArrayList<Coffee> coffeeList;
    public CoffeeApp(ArrayList<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    Coffee first = new Coffee("french", "light");
    Coffee second = new Coffee("cappuccino", "medium");
    Coffee third = new Coffee("kenyan", "dark");

    public static String addCoffee() {

    }

    public static String removeCoffee() {

    }

}