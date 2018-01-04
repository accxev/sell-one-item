import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sellOneItemTest {

    @Test
    public void barcodeGetsReadCorrectlyTest() {
        BarcodeHandler barcodeHandler = new BarcodeHandler();
        barcodeHandler.onBarcode("678");
        assertEquals(barcodeHandler.getBarcode(), "678");
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
