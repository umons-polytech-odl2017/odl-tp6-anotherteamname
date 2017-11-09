public class Ingredient implements Eatable {
    private String name;
    private float price;

    @Override
    public float getPrice() {
        return price;
    }
}
