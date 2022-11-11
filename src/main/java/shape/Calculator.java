package shape;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Calculator {
    public List<Shape> calculator(List<Shape> figure) {
        Objects.requireNonNull(figure);
        return figure.stream()
                .sorted(Comparator.comparing(Shape::calculateArea).reversed())
                .collect(Collectors.toList());
    }
}
