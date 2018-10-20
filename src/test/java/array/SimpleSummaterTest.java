package array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSummaterTest {

    @Test
    void testSum() {
        SimpleSummater summater = new SimpleSummater();
        int[] array = {3,4,1,2};
        int answer = 10;
        assertEquals(summater.sum(array),answer);
    }
}