package project2_restaurant;

/**
 * Bill Class
 * @author Anthony
 */
public class Bill {
    private Combo combo;
    private Customer customer;
    private double originalPrice;
    private double discountedPrice;
    private Tax tax;
    private double finalPrice;

    public Bill() {
        this.combo = new Combo();
        this.customer = new Customer();
        this.originalPrice = 0;
        this.discountedPrice = 0;
        this.tax = new Tax();
        this.finalPrice = 0;
    }

    public Bill(Dish dish, Beverage beverage, Customer customer) {
        this.combo = new Combo(dish, beverage);
        this.originalPrice = combo.calcComboPrice();
        this.customer = customer;
        this.discountedPrice = calcPriceWithDiscount();
        this.tax = calcTax();
        this.finalPrice = calcFinalPrice();
    }
    
    public Bill(Bill bill) {
        this.combo = bill.combo;
        this.customer = bill.customer;
        this.originalPrice = bill.originalPrice;
        this.discountedPrice = bill.discountedPrice;
        this.tax = bill.tax;
        this.finalPrice = bill.finalPrice;
    }
    
    public double calcPriceWithDiscount() {
        double levelOneDiscount = 0.95;
        double levelTwoDiscount = 0.9;
        double levelThreeDiscount = 0.85;
        switch (customer.getVipLevel()) {
            case 1:
                return originalPrice * levelOneDiscount;
            case 2:
                return originalPrice * levelTwoDiscount;
            case 3:
                return originalPrice * levelThreeDiscount;
            default:
                return originalPrice;
        }
    }
    
    public Tax calcTax() {
        double fedTaxCalculated = discountedPrice * 0.05;
        double proTaxCalculated = discountedPrice * 0.1;
        double totaltaxCalculated = fedTaxCalculated + proTaxCalculated;
        return new Tax(fedTaxCalculated, proTaxCalculated, totaltaxCalculated);
    }
    
    public double calcFinalPrice() {
        return discountedPrice + tax.getTotalTax();
    }
    
    public void updatePoints() {
        int pointAcquisitionPrice = 10;
        customer.setPoint(customer.getPoint() + 
                (int)discountedPrice / pointAcquisitionPrice);
    }
    
    public boolean equals(Bill bill) {
        return this.combo.equals(bill.combo) &&
                this.customer.equals(bill.customer) &&
                this.originalPrice == bill.originalPrice &&
                this.discountedPrice == bill.discountedPrice &&
                this.tax.equals(bill.tax) &&
                this.finalPrice == bill.finalPrice;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("%s", combo);
        str += "******************************************\n";
        str += String.format("%-28s : %s - L%d\n", "Customer", 
                customer.getCustomerId(), customer.getVipLevel());
        str += String.format("%-28s : $%.2f\n", "Original Price", originalPrice);
        str += String.format("%-28s : $%.2f\n", "Discounted Price", discountedPrice);
        str += String.format("%-28s : $%.2f\n", "Fed Tax", tax.getFedTax());
        str += String.format("%-28s : $%.2f\n", "Pro Tax", tax.getProTax());
        str += String.format("%-28s : $%.2f\n", "Total Tax", tax.getTotalTax());
        str += "------------------------------------------\n";
        str += String.format("%-28s : $%.2f\n", "Final Price", finalPrice);
        return str;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    
}
