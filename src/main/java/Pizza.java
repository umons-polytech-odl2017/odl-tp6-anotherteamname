import java.util.ArrayList;
import java.util.List;

public class Pizza implements Eatable {
    String name;
    List<Ingredient> ingredients = new ArrayList<>();

    public Pizza(List<Ingredient> l) {
        ingredients = l;
    }

    public Pizza add(Ingredient i) {
        ingredients.add(i);
        return this;
    }

    public Pizza remove(Ingredient i) {
        ingredients.remove(i);
        return this;
    }

    @Override
    public float getPrice() {
        float p = 0;
        for (Ingredient ingredient : ingredients)
            p += ingredient.getPrice();
        return p;
    }

    @Override
    public String getName() {
        return name;
    }
}
