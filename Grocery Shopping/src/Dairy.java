public class Dairy {
    private String product;
    private int quantity;
    private double cost;
    private int daysToExpiration;
    private boolean isConsumable;

    public Dairy(String product, int quantity, double cost, int daysToExpiration) {
        this.product = product;
        this.quantity = quantity;
        this.cost = cost;
        this.daysToExpiration = daysToExpiration;
        this.isConsumable = (daysToExpiration >= 3);
        if (isConsumable) {
            System.out.println("Good choice!");
        } else {
            System.out.println("Check the expiration date");
        }
    }

    public Dairy(String product, int quantity) {
        this(product, quantity, 5.59, 5);
    }

    public Dairy() {
        this("yoghurt", 4, 3.99, 3);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getDaysToExpiration() {
        return daysToExpiration;
    }

    public void setDaysToExpiration(int daysToExpiration) {
        this.daysToExpiration = daysToExpiration;
    }
}
