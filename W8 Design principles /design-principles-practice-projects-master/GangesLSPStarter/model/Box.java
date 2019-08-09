package model;

/**
 * A box for shipping book orders. Boxes come in small, medium, and large sizes.
 */
public class Box {

    private int size;
    private Book contents;
    private static final double MAX_EXPECTED_SHIPPING = 13.00;

    private static final String[] SIZES = {"none", "small", "medium", "large"};
    private static final double BASE_SHIPPING = 5.50;

    // REQUIRES size must be one of "small", "medium", "large"
    public Box(String size) {
        // translate the size string into an int, for easier handling
        if (size.equals("small")) {
            this.size = 1;
        } else if (size.equals("medium")) {
            this.size = 2;
        } else {
            this.size = 3;
        }

        // model.Box starts off empty
        contents = null;
    }

    public void setContents(Book contents) {
        this.contents = contents;
    }

    // EFFECTS: returns the size of this box
    public String getSize() {
        return SIZES[size];
    }

    // EFFECTS: Calculates the shipping cost of this box, based on its size and contents
    public double calculateShipping() {
        double price = BASE_SHIPPING * size;
        if (contents != null) {
            price = price + contents.calculateShipping();
            // model.StandardSizedBook is successfully boxed up, so calculate the shipping cost and make sure it's not too expensive
            if (price > MAX_EXPECTED_SHIPPING) {
                System.out.printf("The shipping for %s have an extra shipped cost.\n", contents.getTitle());
            } else {
                System.out.printf("SUCCESS: %s shipped successfully!\n", contents.getTitle());
            }
        }
        return price;
    }
}
