
import hashTag.HashTag;
import hashTag.HashTagImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import positiveNumber.PositiveNumber;
import positiveNumber.PositiveNumberImpl;
import shape.Calculator;
import shape.Circle;
import shape.Cube;
import shape.Cylinder;
import shape.Shape;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[] {1, 4, 6, 2, 3, 15, 12, 53, -1, -15, -24, -2};
        int[] negative = new int[] {-1, -5, -3};
        PositiveNumber positiveNumber = new PositiveNumberImpl();
        System.out.println(Arrays.toString(positiveNumber.positiveNumber(numbers)));


        List<String> str = new ArrayList<>();
        str.add("#num #num asdfasdf  #num #numbers asdfasdf #numbers asdfasdf #num");
        str.add("#num asdfasdf #num asdfasdf #num #numbers asdfasdf #numbers #num");
        str.add("#enum asdfasdf #num #enum #numbers asdfasdf #numbers #enum");
        str.add("#enum #list asdfasdf #enum #numbers #list #enum");
        str.add("#array #num #array asdfasdf #array #numbers #enum");
        str.add("#size #num #array #size asdfasdf #numbers #enum");
        HashTag hashTag = new HashTagImpl();
        System.out.println(hashTag.hashTag(str));

        Circle circle = new Circle(15);
        System.out.println(circle.calculateArea());

        Cylinder cylinder = new Cylinder(10.0, 15.D);
        System.out.println(cylinder.calculateArea());

        Cube cube = new Cube(11.5);
        System.out.println(cube.calculateArea());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(cylinder);
        shapes.add(cube);

        Calculator calculator = new Calculator();
        System.out.println(calculator.calculator(shapes));

    }
}
