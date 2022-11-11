package shape;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void inputNullInMethod_Ok() {
        assertThrows(NullPointerException.class,
                () -> calculator.calculator(null), "Must throw NullPointer");
    }
}