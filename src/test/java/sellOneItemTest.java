import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sellOneItemTest {

    // TODO barcode should probably be an int or Barcode at some point

    @Test
    public void barcodeGetsReadCorrectlyTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("678");
        assertEquals(barcodeHandler.getScannedBarcode(), "678");
    }

    @Test
    public void catchFaultyBarcodeTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("abc");
        assertEquals(barcodeHandler.getIntBarcode(), -1);
    }

    @Test
    public void catchFaultyNegativeBarcodeTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("-123");
        assertEquals(barcodeHandler.getIntBarcode(), -1);
    }




    @Test
    @Ignore
    public void faultyBarcodePrizeDisplayTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("abc");

        assertEquals("This item is not in the system", barcodeHandler.getLastDisplayedText());
    }

    @Test
    public void fullDataFlowTest() {

        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("123");

        assertEquals("$2.50", barcodeHandler.getLastDisplayedText());

    }

    @Test
    public void fullDataFlowTestSecondItem() {

        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("111");
        assertEquals("$1.12", barcodeHandler.getLastDisplayedText());
    }
}
