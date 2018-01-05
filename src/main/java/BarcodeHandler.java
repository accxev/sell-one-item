import java.math.BigDecimal;
import java.util.HashMap;

public class BarcodeHandler {

    private String scannedBarcode;
    //private int intBarcode;
    private HashMap<Integer, Item> barcodeToItemMap = new HashMap<Integer, Item>();
    private String lastDisplayedText;


    public BarcodeHandler() {
        // just some dummy items
        barcodeToItemMap.put(123, new Item("Lollipop", new BigDecimal("2.50")));
        //barcodeToItemMap.put(-1, new Item("Not in the system", new BigDecimal("0.00")));
        barcodeToItemMap.put(111, new Item("Candy Cane", new BigDecimal("1.12")));
        barcodeToItemMap.put(666, new Item("Black candles", new BigDecimal("6.66")));
        barcodeToItemMap.put(678, new Item("Box of cookies", new BigDecimal("12.00")));


    }


    public void onBarcode(String scannedBarcode) {
        int intBarcode = -1;
        if (scannedBarcode.matches("\\d+")) {
            this.scannedBarcode = scannedBarcode;
            intBarcode = Integer.parseInt(scannedBarcode);
        }
        else {
            this.scannedBarcode = scannedBarcode;
            intBarcode = -1;
        }

        if (barcodeToItemMap.containsKey(intBarcode)) {
            Item item = barcodeToItemMap.get(intBarcode);   // What happens if the item is not in the Hashmap?
            lastDisplayedText = item.displayPrize();
        }
        else {
            lastDisplayedText = "This item is not in the system.";
        }

    }

    public String getLastDisplayedText() {
        //if (scannedBarcode.equals("123")) return "$2.50";
        //if (scannedBarcode.equals("111")) return "$1.12";
        //if (intBarcode==-1) return "This item is not in the system.";
        return lastDisplayedText;
    }

    public String getScannedBarcode() {
        return scannedBarcode;
    }

    /*public int getIntBarcode() {
        return intBarcode;
    }*/
}
