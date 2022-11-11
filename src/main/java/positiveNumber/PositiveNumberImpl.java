package positiveNumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class PositiveNumberImpl implements PositiveNumber {
    @Override
    public int[] positiveNumber(int[] numbers) {
        Objects.requireNonNull(numbers);
            int[] ints = Arrays.stream(numbers)
                    .filter(n -> n >= 0)
                    .boxed()
                    .sorted(Collections.reverseOrder())
                    .mapToInt(n -> n).toArray();
        return ints;
    }
}
