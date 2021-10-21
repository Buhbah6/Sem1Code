package project2_restaurant;

/**
 * Dish Class
 * @author Anthony Nadeau
 */
public class Dish {
    private String dishId;
    private String dishName;
    private char size;
    public double price;
    private boolean spicy;
    private static int nextId = 1;

    public Dish() {
        this.dishId = generateId();
        this.dishName = null;
        this.price = 0;
        this.size = 0;
        this.price = 0;
        this.spicy = false;
    }

    public Dish(String dishName, char size, double price, boolean spicy) {
        this.dishId = generateId();
        this.dishName = dishName;
        this.size = size;
        this.price = price;
        this.spicy = spicy;
    }
    
    public Dish(Dish dish) {
        this.dishId = dish.dishId;
        this.dishName = dish.dishName;
        this.size = dish.size;
        this.price = dish.price;
        this.spicy = dish.spicy;
    }
    
    private String generateId() {
        String str = "";
        str += String.format("D%03d", nextId);
        nextId++;
        return str;
    }
    
    public double calcDishPrice() {
        double extraLargeMultiplier = 1.2;
        double mediumDiscount = 0.6;
        double smallDiscount = 0.4;
        size = Character.toUpperCase(size);
        switch (size) {
            case 'X':
                return price * extraLargeMultiplier;
            case 'M':
                return price * mediumDiscount;
            case 'S':
                return price * smallDiscount;
            default:
                return price;
        } 
    }
    
    public boolean equals(Dish dish) {
        return this.dishId.equals(dish.dishId) &&
                this.dishName.equals(dish.dishName) &&
                this.size == dish.size &&
                this.price == this.price &&
                this.spicy == dish.spicy;
    }
    
    @Override
    public String toString() {
        String spicyStr = "";
        if (spicy) spicyStr = "Spicy";
        else spicyStr = "Not Spicy";
        String str = "";
        str += String.format("\t%-20s : %s\n", "Dish ID", dishId);
        str += String.format("\t%-20s : %s\n", "Dish Name", dishName);
        str += String.format("\t%-20s : %c\n", "Dish Size", size);
        str += String.format("\t%-20s : %.2f\n", "Dish Price", price);
        str += String.format("\t%-20s : %s\n", "Spicy", spicyStr);
        return str;
    }

    public String getDishId() {
        return dishId;
    }

    public void setDishId(String dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSpicy() {
        return spicy;
    }

    public void setSpicy(boolean spicy) {
        this.spicy = spicy;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Dish.nextId = nextId;
    }
    
    
}
