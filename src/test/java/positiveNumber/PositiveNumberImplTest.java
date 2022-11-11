package positiveNumber;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PositiveNumberImplTest {
    PositiveNumber positiveNumber = new PositiveNumberImpl();
    @Test
    void outputArrays_Ok() {
        int[] numbers = new int[] {1, 4, 6, 2, 3, 15, 12, 53, -1, -15, -24, -2};
        int[] actual = positiveNumber.positiveNumber(numbers);
        int[] expected = new int[] {53,15, 12, 6, 4, 3, 2, 1};
        boolean result = Arrays.equals(actual, expected);
        assertTrue(result);
    }

    @Test
    void outputArrays_NotOk() {
        int[] numbers = new int[] {1, 4, 6, 2, 3, 15, 12, 53, -1, -15, -24, -2};
        int[] actual = positiveNumber.positiveNumber(numbers);
        int[] expected = new int[] {15, 55, 12, 6, 4, 3, 2, 1};
        boolean result = Arrays.equals(actual, expected);
        assertFalse(result);
    }

    @Test
    void inputNullInMethod_Ok() {
        assertThrows(NullPointerException.class,
                () -> positiveNumber.positiveNumber(null), "Must throw NullPointer");
    }

    @Test
    void emptyArray_Ok() {
        int[] numbers = new int[0];
        int[] actual = positiveNumber.positiveNumber(numbers);
        int[] expected = new int[0];
        assertTrue(Arrays.equals(actual, expected));
    }

    @Test
    void returnNewArray_Ok() {
        int[] numbers = new int[] {53,15, 12, 6, 4, 3, 2, 1};
        int[] actual = positiveNumber.positiveNumber(numbers);
        assertNotEquals(numbers, actual);
    }
}