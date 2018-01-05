import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void correctPrizeDisplayTest() {
        Item muffin = new Item("Muffin", 1.00);
        assertEquals(muffin.displayPrize(), "$1.00");
    }

}
