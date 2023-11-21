public class ShoppingCart {
    private Dairy[] dairyItems;
    private Bakery[] bakeryItems;

    public ShoppingCart(Dairy[] dairyItems, Bakery[] bakeryItems) {
        this.dairyItems = new Dairy[dairyItems.length];
        for (int i = 0; i < this.dairyItems.length; i++) {
            this.dairyItems[i] = dairyItems[i];
        }
        this.bakeryItems = new Bakery[bakeryItems.length];
        for (int i = 0; i < this.bakeryItems.length; i++) {
            this.bakeryItems[i] = bakeryItems[i];
        }
    }

    public ShoppingCart() {
        this(new Dairy[4], new Bakery[] {new Bakery("Bread", 1, 5.99), null});
    }

    public Dairy addDairyItemAtIndex(int index, Dairy toAdd) {
        try {
            if (toAdd == null) {
                System.out.println("Cannot add Dairy item!");
                return null;
            }
            if (this.dairyItems[index] == null) {
                this.dairyItems[index] = toAdd;
                System.out.println(toAdd.getProduct() + " was added here.");
                return null;
            } else {
                System.out.println("There was " + this.dairyItems[index].getProduct() + " here before.");
                Dairy removed = this.dairyItems[index];
                this.dairyItems[index] = toAdd;
                System.out.println(removed.getProduct());
                return removed;
            }
        } catch (Exception e) {
            System.out.println("Cannot add Dairy item!");
            return null;
        }
    }

    public Bakery removeBakeryItemAtIndex(int index) {
        try {
            if (bakeryItems[index] != null) {
                Bakery removed = bakeryItems[index];
                System.out.println(removed.getProduct() + " was removed from the cart.");
                bakeryItems[index] = null;
                return removed;
            } else {
                System.out.println("No Bakery item exists at this index!");
                return null;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index entered");
            return null;
        }
    }

    public void updateDairyQuantity(String product, int quantity) {
        boolean isFound = false;
        for (Dairy d : dairyItems) {
            if (d.getProduct().toLowerCase().equals(product.toLowerCase())) {
                if (quantity < 0) {
                    System.out.println("Invalid quantity");
                    isFound = true;
                    break;
                } else {
                    int old = d.getQuantity();
                    d.setQuantity(quantity);
                    System.out.println("Quantity of " + product.toLowerCase() + " was updated from "
                            + old + " to " + d.getQuantity() + ".");
                    isFound = true;
                    break;
                }
            }
        }
        if (!isFound) {
            System.out.println("No such Dairy item exists in the cart!");
        }
    }

    public void displayItems() {
        for (Dairy d : dairyItems) {
            if (d == null) {
                System.out.println("null");
            } else {
                System.out.printf("Dairy Product: " + d.getProduct() + " Quantity: "
                        + d.getQuantity() + " Cost %.2f\n", d.getCost());
            }
        }

        for (Bakery b : bakeryItems) {
            if (b == null) {
                System.out.println("null");
            } else {
                System.out.printf("Bakery Product: " + b.getProduct() + " Quantity: "
                        + b.getQuantity() + " Cost %.2f\n", b.getCost());
            }
        }
    }


}
