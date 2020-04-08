package triangles;

import java.util.ArrayList;
import java.util.List;

public class RightTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> triangleEdges) {
        List<Double> edges = new ArrayList<>(triangleEdges);
        double maxEdge = findTheLongestEdge(edges);
        edges.remove(maxEdge);
        if (Math.pow(maxEdge, 2) == Math.pow(edges.get(0), 2) + Math.pow(edges.get(1), 2)) {
            return true;
        }
        return false;
    }
}
