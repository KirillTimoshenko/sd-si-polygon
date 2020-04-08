package triangles;

import java.util.ArrayList;
import java.util.List;

public class EquilateralTriangle extends Triangle {

    @Override
    public boolean checkTriangleType(List<Double> triangleEdges) {
        List<Double> edges = new ArrayList<>(triangleEdges);
        double maxEdge = findTheLongestEdge(edges);
        edges.remove(maxEdge);
        if (maxEdge != edges.get(0)) {
            return false;
        } else if (maxEdge != edges.get(1)) {
            return false;
        }
        return true;
    }
}
