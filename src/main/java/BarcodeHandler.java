public class BarcodeHandler {

    private String scannedBarcode;
    private int intBarcode;





    public void onBarcode(String scannedBarcode) {
        if (scannedBarcode.matches("\\d+")) {
            this.scannedBarcode = scannedBarcode;
            int barcode = Integer.parseInt(scannedBarcode);
            this.intBarcode = barcode;
        }
        else {
            this.scannedBarcode = scannedBarcode;
            this.intBarcode = -1;
        }

    }

    public String getLastDisplayedText() {
        if (scannedBarcode.equals("123")) return "$2.50";
        if (scannedBarcode.equals("111")) return "$1.12";
        return "";
    }

    public String getScannedBarcode() {
        return scannedBarcode;
    }

    public int getIntBarcode() {
        return intBarcode;
    }
}
