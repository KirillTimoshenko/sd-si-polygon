import triangles.Triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleKeeper {
    private final List<Triangle> triangles;

    public TriangleKeeper() {
        triangles = new ArrayList<>();
    }

    public TriangleKeeper addTriangle(Triangle triangle) {
        triangles.add(triangle);
        return this;
    }

    public List<Triangle> getTriangles() {
        return triangles;
    }
}
