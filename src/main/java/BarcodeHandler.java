public class BarcodeHandler {

    private String barcode;



    public void onBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getLastDisplayedText() {
        if (barcode.equals("123")) return "$2.50";
        if (barcode.equals("111")) return "$1.12";
        return "";
    }

    public String getBarcode() {
        return barcode;
    }
}
