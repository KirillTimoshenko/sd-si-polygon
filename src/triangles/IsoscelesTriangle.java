package triangles;

import java.util.ArrayList;
import java.util.List;

public class IsoscelesTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> triangleEdges) {
        List<Double> edges = new ArrayList<>(triangleEdges);
        double maxEdge = findTheLongestEdge(edges);
        edges.remove(maxEdge);
        if (maxEdge == edges.get(0)) {
            return true;
        } else if (maxEdge == edges.get(1)) {
            return true;
        } else if (edges.get(0).equals(edges.get(1))) {
            return true;
        }
        return false;
    }
}
