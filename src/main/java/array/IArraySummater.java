package array;

import exceptions.ArraySummaterException;
/**
 * Interface IArraySummater for differents realization
 */
public interface IArraySummater {
    /**
     * sum function need in realization
     * @param array - int array
     * @throws ArraySummaterException - exception that throw when array has odd length
     * @return int
     */
    int sum(int[] array) throws ArraySummaterException;
}
