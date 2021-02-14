package PizzaSlice;

public class Pizza {
    private int id = 0;
    private int noToppings = 0;
    private String[] toppings;

    public Pizza(int id, int noToppings, String[] toppings) {
        this.id = id;
        this.noToppings = noToppings;
        this.toppings = toppings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoToppings() {
        return noToppings;
    }

    public void setNoToppings(int noToppings) {
        this.noToppings = noToppings;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }
}

