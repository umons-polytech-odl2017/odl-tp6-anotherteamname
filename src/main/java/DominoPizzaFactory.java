import java.util.ArrayList;
import java.util.List;

public class DominoPizzaFactory implements AbstractFactory {
    private List<Pizza> menu = new ArrayList<>();

    @Override
    public Pizza createPizza(List<Ingredient> l) {
        Pizza p = new Pizza(l);
        if (menu.indexOf(p) != menu.lastIndexOf(p))
            return null;
        menu.add(p);
        return p;
    }
}
