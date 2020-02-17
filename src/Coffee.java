import java.util.ArrayList;

public class Coffee {

    private String coffeeName;
    private String coffeeBlend;

    public Coffee(String coffeeName, String coffeeBlend) {
        this.coffeeName = coffeeName;
        this.coffeeBlend = coffeeBlend;


    }



    public String getCoffeeName() {
        return this.coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getCoffeeBlend() {
        return this.coffeeBlend;
    }

    public void setCoffeeBlend(String coffeeBlend) {
        this.coffeeBlend = coffeeBlend;
    }



}