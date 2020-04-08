package triangles;

import java.util.List;

public class IsoscelesTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> triangleEdges) {
        double edgeA = triangleEdges.get(0);
        double edgeB = triangleEdges.get(1);
        double edgeC = triangleEdges.get(2);

        return edgeA == edgeB
                || edgeA == edgeC
                || edgeB == edgeC;
    }
}
