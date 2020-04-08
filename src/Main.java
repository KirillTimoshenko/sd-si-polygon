import triangles.EquilateralTriangle;
import triangles.IsoscelesTriangle;
import triangles.RightTriangle;

import java.util.List;

public class Main {

    public static void main(String[] arg) {
        TriangleEdgesScanner scanner = new TriangleEdgesScanner();
        List<Double> triangleEdges = scanner.getTriangleEdges();

        TriangleKeeper triangleKeeper = new TriangleKeeper();
        triangleKeeper.addTriangle(new RightTriangle())
                .addTriangle(new EquilateralTriangle())
                .addTriangle(new IsoscelesTriangle());

        triangleKeeper.getTriangles().stream()
                .filter(triangle -> triangle.checkTriangleType(triangleEdges))
                .forEach(System.out::println);
    }
}