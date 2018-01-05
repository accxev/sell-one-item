import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Item {
    private final BigDecimal price;
    //private final double price;
    //private final String name;

    public Item(String name, BigDecimal price) {
        //this.name = name;
        this.price = price;
    }

    public String displayPrize() {
        return "$" + String.format("%.2f",price);
    }
}
