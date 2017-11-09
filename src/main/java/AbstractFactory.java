import java.util.List;

public interface AbstractFactory {
    Pizza createPizza(List<Ingredient> l);
}
