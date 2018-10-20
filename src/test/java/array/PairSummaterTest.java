package array;

import exceptions.ArraySummaterException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairSummaterTest {
    @Test
    public void testSum() throws ArraySummaterException {
        PairSummater summater = new PairSummater();
        int[] array = {3,4,1,2};
        int answer = 7;
        assertEquals(summater.sum(array),answer);
    }
}