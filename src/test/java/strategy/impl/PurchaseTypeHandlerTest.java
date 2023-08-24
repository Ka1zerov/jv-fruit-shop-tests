package strategy.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PurchaseTypeHandlerTest {

    private static final PurchaseTypeHandler PURCHASE_TYPE_HANDLER = new PurchaseTypeHandler();

    @Test
    public void edgeInt_Ok() {
        assertEquals(-1,
                PURCHASE_TYPE_HANDLER.getNewQuantity(Integer.MAX_VALUE, Integer.MIN_VALUE),
                "Addition result is incorrect");
    }

    @Test
    public void goodInt_Ok() {
        int before = 10;
        int after = 5;
        int expectedResult = before - after;

        int result = PURCHASE_TYPE_HANDLER.getNewQuantity(before, after);

        assertEquals(expectedResult, result, "Addition result is incorrect");
    }
}