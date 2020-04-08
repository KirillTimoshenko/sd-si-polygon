import triangles.EquilateralTriangle;
import triangles.IsoscelesTriangle;
import triangles.RightTriangle;
import triangles.Triangle;

import java.util.InputMismatchException;
import java.util.List;

public class Main {

    public static void main(String[] arg) {
        try {
            TriangleEdgesScanner scanner = new TriangleEdgesScanner();
            List<Double> triangleEdges = scanner.getTriangleEdges();

            if (!Triangle.isTriangle(triangleEdges)) {
                System.err.println("It's not a triangle.");
                System.exit(0);
            }

            TriangleKeeper triangleKeeper = new TriangleKeeper();
            triangleKeeper.addTriangle(new RightTriangle())
                    .addTriangle(new EquilateralTriangle())
                    .addTriangle(new IsoscelesTriangle());

            triangleKeeper.getTriangles().stream()
                    .filter(triangle -> triangle.checkTriangleType(triangleEdges))
                    .forEach(System.out::println);

        } catch (InputMismatchException exception) {
            System.err.println("Invalid triangle edges.");
        }
    }
}