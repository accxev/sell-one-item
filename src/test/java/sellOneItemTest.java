import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sellOneItemTest {

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
        assertEquals("This item is not in the system.", barcodeHandler.getLastDisplayedText());
    }

    @Test
    public void catchFaultyNegativeBarcodeTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("-123");
        assertEquals("This item is not in the system.", barcodeHandler.getLastDisplayedText());
    }


    @Test
    public void faultyBarcodePrizeDisplayTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("abc");

        assertEquals("This item is not in the system.", barcodeHandler.getLastDisplayedText());
    }

    @Test
    public void inputOutputTest() {

        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("123");

        assertEquals("$2.50", barcodeHandler.getLastDisplayedText());
    }

    @Test
    public void InputOutputTestSecondItem() {

        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("111");
        assertEquals("$1.12", barcodeHandler.getLastDisplayedText());
    }

    @Test
    public void InputOutputTestThirdItem() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("666");
        assertEquals("$6.66", barcodeHandler.getLastDisplayedText());
    }
}
