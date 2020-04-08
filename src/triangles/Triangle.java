package triangles;

import java.util.Collections;
import java.util.List;

abstract public class Triangle {

    public static boolean isTriangle(List<Double> triangleEdges) {
        if (triangleEdges.get(0) >= triangleEdges.get(1) + triangleEdges.get(2)) {
            return false;
        } else if (triangleEdges.get(1) >= triangleEdges.get(0) + triangleEdges.get(2)) {
            return false;
        } else if (triangleEdges.get(2) >= triangleEdges.get(0) + triangleEdges.get(1)) {
            return false;
        }
        return true;
    }

    public abstract boolean checkTriangleType(List<Double> triangleEdges);

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName();
    }

    protected double findTheLongestEdge(List<Double> triangleEdges) {
        return Collections.max(triangleEdges);
    }
}
