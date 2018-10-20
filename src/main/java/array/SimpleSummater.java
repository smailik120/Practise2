package array;
/**
 * SimpleSummater realization IArraySummater
 */
public class SimpleSummater {
    /**
     * sum function for sum pair in array
     * @param array - int array
     * @return int
     */
    public int sum(final int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
