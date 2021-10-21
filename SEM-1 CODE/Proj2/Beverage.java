package project2_restaurant;

/**
 * Beverage Class
 * @author Anthony Nadeau
 */
public class Beverage {
    private String beverageId;
    private String beverageName;
    public double price;
    private int volume;
    private static int nextId = 1;

    public Beverage() {
        this.beverageId = generateId();
        this.beverageName = null;
        this.price = 0;
        this.volume = 0;
    }

    public Beverage(String beverageName, double price, int volume) {
        this.beverageId = generateId();
        this.beverageName = beverageName;
        this.price = price;
        this.volume = volume;
    }
    
    public Beverage(Beverage beverage) {
        this.beverageId = beverage.beverageId;
        this.beverageName = beverage.beverageName;
        this.price = beverage.price;
        this.volume = beverage.volume;
    }
    
    private String generateId() {
        String str = "";
        str += String.format("B%03d", nextId);
        nextId++;
        return str;
    }
    
    public double calcPrice() {
        double smallVolumeDiscount = 0.6;
        int volumeThreshold = 500;  // 500 ml
        if (this.volume > volumeThreshold)
            return this.price;
        else {
            return this.price * smallVolumeDiscount;
        }
    }
    
    public boolean equals(Beverage beverage) {
        return this.beverageName.equals(beverage.beverageName) &&
                this.beverageId.equals(beverage.beverageId) &&
                this.price == beverage.price &&
                this.volume == beverage.volume;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("\t%-20s : %s\n", "Beverage Id", beverageId);
        str += String.format("\t%-20s : %s\n", "Beverage Name", beverageName);
        str += String.format("\t%-20s : %.2f\n", "Beverage Price", price);
        str += String.format("\t%-20s : %d\n", "Beverage", volume);
        return str;
    }

    public String getBeverageId() {
        return beverageId;
    }

    public void setBeverageId(String beverageId) {
        this.beverageId = beverageId;
    }

    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Beverage.nextId = nextId;
    }
    
    
}
