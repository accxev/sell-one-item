import java.math.BigDecimal;
import java.util.HashMap;

public class BarcodeHandler {

    private HashMap<Integer, Item> barcodeToItemMap = new HashMap<Integer, Item>();
    private String lastDisplayedText;


    public BarcodeHandler() {
        // just some dummy items
        barcodeToItemMap.put(123, new Item("Lollipop", new BigDecimal("2.50")));
        barcodeToItemMap.put(111, new Item("Candy Cane", new BigDecimal("1.12")));
        barcodeToItemMap.put(666, new Item("Black candles", new BigDecimal("6.66")));
        barcodeToItemMap.put(678, new Item("Box of cookies", new BigDecimal("12.00")));


    }


    public void onBarcode(String scannedBarcode) {
        int intBarcode;

        try {
            intBarcode = Integer.parseInt(scannedBarcode);
        }
        catch (NumberFormatException e) {
            intBarcode = -1;
        }

        if (intBarcode >= 0 && barcodeToItemMap.containsKey(intBarcode)) {
            Item item = barcodeToItemMap.get(intBarcode);
            lastDisplayedText = item.displayPrize();
        }
        else {
            lastDisplayedText = "This item is not in the system.";
        }

    }

    public String getLastDisplayedText() {
        return lastDisplayedText;
    }

}
