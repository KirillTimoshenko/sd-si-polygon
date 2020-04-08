package triangles;

import java.util.List;

public abstract class Triangle {

    public static boolean isTriangle(List<Double> triangleEdges) {
        double edgeA = triangleEdges.get(0);
        double edgeB = triangleEdges.get(1);
        double edgeC = triangleEdges.get(2);
        return checkTriangleInequality(edgeA, edgeB, edgeC)
                && checkTriangleInequality(edgeB, edgeA, edgeC)
                && checkTriangleInequality(edgeC, edgeB, edgeA);
    }

    public static boolean checkTriangleInequality(double a, double b, double c) {
        return a < b + c;
    }
    public abstract boolean checkTriangleType(List<Double> triangleEdges);

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName();
    }
}
