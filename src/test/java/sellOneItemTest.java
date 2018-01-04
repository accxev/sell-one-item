import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sellOneItemTest {

    @Test
    public void fullDataFlowTest() {
        String barcode = "123";

        BarcodeHandler barcodeHandler = new BarcodeHandler();

        barcodeHandler.onBarcode(barcode);

        String text = barcodeHandler.getLastDisplayedText();

        assertEquals("$2.50", text);

    }
}
