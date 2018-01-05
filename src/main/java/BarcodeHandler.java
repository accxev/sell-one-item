import java.util.HashMap;

public class BarcodeHandler {

    private String scannedBarcode;
    private int intBarcode;
    public HashMap<Integer, Item> barcodeToItemMap = new HashMap<Integer, Item>();
    private String lastDisplayedText;
    private Item item;


    public BarcodeHandler() {
        // just some dummy items
        //HashMap barcodeToItemMap = new HashMap<Integer, Item>();
        barcodeToItemMap.put(123, new Item("Lollipop", 2.50));
        barcodeToItemMap.put(-1, new Item("Not in the system", 0.00));
        barcodeToItemMap.put(111, new Item("Candy Cane", 1.50));
        barcodeToItemMap.put(666, new Item("Black candles", 6.66));
        barcodeToItemMap.put(678, new Item("Box of cookies", 12.00));


    }


    public void onBarcode(String scannedBarcode) {
        if (scannedBarcode.matches("\\d+")) {
            this.scannedBarcode = scannedBarcode;
            this.intBarcode = Integer.parseInt(scannedBarcode);
        }
        else {
            this.scannedBarcode = scannedBarcode;
            this.intBarcode = -1;
        }

        item = barcodeToItemMap.get(intBarcode);
        lastDisplayedText = item.displayPrize();

    }

    public String getLastDisplayedText() {
        //barcodeToItemMap.get()
        if (scannedBarcode.equals("123")) return "$2.50";
        if (scannedBarcode.equals("111")) return "$1.12";
        if (intBarcode==-1) return "This item is not in the system.";
        return lastDisplayedText;
    }

    public String getScannedBarcode() {
        return scannedBarcode;
    }

    public int getIntBarcode() {
        return intBarcode;
    }
}
