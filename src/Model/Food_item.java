package Model;
public class Food_item {
    /* food item attributes */
    private int id;
    private String food_item_name;
    private String food_item_ingredients;
    private float food_item_cost;
    private float food_item_discount;
    //constructor with specified ingredients:-
    public Food_item(int id, String name, String ingredients, float cost, float discount)
    {
        setId(id);
        setFood_item_name(name);
        setFood_item_ingredients(ingredients);
        setFood_item_cost(cost);
        setFood_item_discount(discount);
    }
    //constructor without specified ingredients:-
    public Food_item(int id, String name, float cost, float discount)
    {
        setId(id);
        setFood_item_name(name);
        setFood_item_ingredients("not specified");
        setFood_item_cost(cost);
        setFood_item_discount(discount);
    }
    public void setId(int food) {
        this.id = food;
    }

    public void setFood_item_name(String food_item_name) {
        this.food_item_name = food_item_name;
    }

    public void setFood_item_ingredients(String food_item_ingredients) {
        this.food_item_ingredients = food_item_ingredients;
    }

    public void setFood_item_cost(float food_item_cost) {
        this.food_item_cost = food_item_cost;
    }

    public void setFood_item_discount(float food_item_discount) {
        this.food_item_discount = food_item_discount;
    }

    public int getId() {
        return this.id;
    }

    public String getFood_item_name() {
        return this.food_item_name;
    }

    public String getFood_item_ingredients() {
        return this.food_item_ingredients;
    }

    public float getFood_item_cost() {
        return this.food_item_cost;
    }

    public float getFood_item_discount() {
        return this.food_item_discount;
    }
}