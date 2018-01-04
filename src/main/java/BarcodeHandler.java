import java.util.HashMap;

public class BarcodeHandler {

    private String scannedBarcode;
    private int intBarcode;



    public BarcodeHandler() {
        // just some dummy items
        HashMap barcodeToItemMap = new HashMap<Integer, Item>();
        barcodeToItemMap.put(123, new Item("Lollipop", 2.50));
        barcodeToItemMap.put(-1, new Item("Not in the system", 0.00));
        barcodeToItemMap.put(111, new Item("Candy Cane", 1.50));


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

    }

    public String getLastDisplayedText() {
        if (scannedBarcode.equals("123")) return "$2.50";
        if (scannedBarcode.equals("111")) return "$1.12";
        return "This item is not in the system.";
    }

    public String getScannedBarcode() {
        return scannedBarcode;
    }

    public int getIntBarcode() {
        return intBarcode;
    }
}
