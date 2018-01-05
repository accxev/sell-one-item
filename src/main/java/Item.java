import java.math.BigDecimal;

public class Item {
    private final BigDecimal price;

    public Item(String name, BigDecimal price) {
        this.price = price;
    }

    public String displayPrize() {
        return "$" + String.format("%.2f",price);
    }
}
