package shape;

import lombok.Data;

@Data
public class Cylinder implements Shape {
    private final Double length;
    private final Double radius;

    public Cylinder(Double length, Double radius) {
        this.length = length;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * length;
    }
}
