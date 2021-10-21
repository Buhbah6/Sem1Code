package project2_restaurant;

/**
 * Combo Class
 * @author Anthony Nadeau
 */
public class Combo {
    Dish dish;
    Beverage beverage;

    public Combo() {
        this.dish = new Dish();
        this.beverage = new Beverage();
    }

    public Combo(Dish dish, Beverage beverage) {
        this.dish = dish;
        this.beverage = beverage;
    }
    
    public Combo(Combo combo) {
        this.dish = combo.dish;
        this.beverage = combo.beverage;
    }
    
    public double calcComboPrice() {
        double comboReducedPrice = 0.9;
        return (dish.price + beverage.price) * comboReducedPrice;
    }
    
    public boolean equals(Combo combo) {
        return this.beverage.equals(combo.beverage) &&
                this.dish.equals(combo.dish);
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("%s:\n %s\n\n", "Dish", dish);
        str += String.format("%s:\n %s\n\n", "Beverage", beverage);
        return str;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }
    
    
}
