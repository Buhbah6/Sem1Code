package project2_restaurant;

/**
 * Customer Class
 * @author Anthony Nadeau
 */
public class Customer {
    private String customerId;
    private String name;
    private int vipLevel;
    private int point;
    private static int nextId = 1;

    public Customer() {
        this.customerId = generateId();
        this.name = null;
        this.vipLevel = 0;
        this.point = 0;
    }

    public Customer(int vipLevel, int point) {
        this.customerId = generateId();
        this.name = null;
        this.vipLevel = vipLevel;
        this.point = point;
    }
    
    public Customer(Customer customer) {
        this.customerId = customer.customerId;
        this.name = customer.name;
        this.vipLevel = customer.vipLevel;
        this.point = customer.point;
    }
    
    private String generateId() {
        String str = "";
        str += String.format("C%03d", nextId);
        nextId++;
        return str;
    }
   
    public boolean updateVip() {
        int firstPointCost = 50;
        int secondPointCost = 80;
        int thirdPointCost = 100;
        if (vipLevel == 0 && point >= firstPointCost) {
            vipLevel++;
            point -= firstPointCost;
            return true;
        }
        else if (vipLevel == 1 && point >= secondPointCost) {
            vipLevel++;
            point -= secondPointCost;
            return true;
        }
        else if (vipLevel == 2 && point >= thirdPointCost) {
            vipLevel++;
            point -= thirdPointCost;
            return true;
        }
        return false;
    }
    
    public boolean equals(Customer customer) {
        return this.customerId.equals(customer.customerId) &&
                this.name.equals(customer.name) &&
                this.vipLevel == customer.vipLevel &&
                this.point == customer.point;
    }
    
    @Override
    public String toString() {
        String str = "";
        str += String.format("\t%-20s : %s", "Customer ID", customerId);
        str += String.format("\t%-20s : %s", "Name", name);
        str += String.format("\t%-20s : %s", "VIP Level", vipLevel);
        str += String.format("\t%-20s : %s", "Points", point);
        return str;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Customer.nextId = nextId;
    }
    
    
}
