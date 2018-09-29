package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements IPizzaBuilder {

    private List<String> toppings = new ArrayList<>();
    private String size;

    @Override
    public void addTopping(String topping) {
        this.toppings.add(topping);
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public Pizza getPizza() {
        return new Pizza(size, toppings);
    }
}
