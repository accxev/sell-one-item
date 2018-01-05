import java.text.DecimalFormat;

public class Item {
    private final double price;
    //private final String name;

    public Item(String name, double price) {
        //this.name = name;
        this.price = price;
    }

    public String displayPrize() {
        return "$" + String.format("%.2f",price);
    }
}
