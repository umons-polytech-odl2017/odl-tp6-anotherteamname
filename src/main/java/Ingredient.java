public class Ingredient implements Eatable {
    private String name;
    private float price;

    public Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }
}
