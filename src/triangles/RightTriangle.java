package triangles;

import java.util.List;

public class RightTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> triangleEdges) {
        double edgeA = triangleEdges.get(0);
        double edgeB = triangleEdges.get(1);
        double edgeC = triangleEdges.get(2);

        return checkRightTriangle(edgeA, edgeB, edgeC)
                || checkRightTriangle(edgeB, edgeC, edgeA)
                || checkRightTriangle(edgeC, edgeA, edgeB);
    }

    private boolean checkRightTriangle(double a, double b, double c) {
        return Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2);
    }
}
