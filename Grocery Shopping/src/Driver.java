public class Driver {
    public static void main(String[] args) {
        // Create 3 Dairy objects and place them in an array.
        //Create 3 Bakery objects and place them in an array.
        //reate a ShoppingCart object with the arrays created previously.
        //Create and add 1 Dairy object using addDairyItemAtIndex
        //Remove 1 Bakery object using removeBakeryItemAtIndex
        //Update the quantity of a Dairy object using updateDairyQuantity
        //TIP: Print out the contents of dairyItems and BakeryItems using the
        //displayItems method to see the changes expected after adding, removing, or
        //updating objects.

        Dairy milk = new Dairy("milk", 10);
        Dairy yoghurt = new Dairy();

        Dairy[] foo = {milk, yoghurt};

        Bakery cake = new Bakery("cake", 21, 4.20);
        Bakery andrew = new Bakery("andrew", 69, 4.20);

        Bakery[] foo2 = {cake, andrew};

        ShoppingCart gilbert = new ShoppingCart(foo, foo2);

        gilbert.displayItems();

        gilbert.removeBakeryItemAtIndex(5);

        gilbert.displayItems();

        Dairy waterBottle = new Dairy("water bottle", 10);

        gilbert.addDairyItemAtIndex(1, waterBottle);
        gilbert.updateDairyQuantity("foober", 69);
    }
}
