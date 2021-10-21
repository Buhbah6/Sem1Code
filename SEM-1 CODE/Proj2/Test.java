package project2_restaurant;

/**
 * Test Class
 * @author Anthony Nadeau
 */
public class Test {
    public static void main(String[] args) {
        Dish dish = new Dish("Fried Chicken", 'x', 20.00, true);
        Beverage beverage = new Beverage("Diet Coke", 2, 500);
        Customer customer = new Customer(2, 0);
        Bill bill = new Bill(dish, beverage, customer);
        System.out.println(bill);
    }
}
