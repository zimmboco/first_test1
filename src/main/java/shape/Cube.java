package shape;

import lombok.Data;

@Data
public class Cube implements Shape {
    private final double sideLength;

    public Cube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
