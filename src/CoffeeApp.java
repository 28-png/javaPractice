import java.util.ArrayList;

public class CoffeeApp {

   public ArrayList<Coffee> coffeeList;



    public CoffeeApp() {
        coffeeList = new ArrayList<>();
    }

    Coffee first = new Coffee("french", "light");
    Coffee second = new Coffee("cappuccino", "medium");
    Coffee third = new Coffee("kenyan", "dark");

    public void addCoffee(Coffee newCoffee) {
       this.coffeeList.add(newCoffee);
    }

    public void removeCoffee(Coffee coffeeGone) {
     this.coffeeList.remove(coffeeGone);
    }

}