import triangles.Triangle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleEdgesScanner {
    private final List<Double> edgesList;

    public TriangleEdgesScanner() {
        edgesList = new ArrayList<>();
        scanInputEdges();
    }

    public List<Double> getTriangleEdges() {
        return edgesList;
    }

    public void scanInputEdges() {
        Scanner scanner = new Scanner(System.in);
        boolean checkInput = false;
        while (!checkInput) {
            edgesList.clear();
            for (int i = 0; i < 3; ++i) {
                System.out.println("Please, enter the edge of the triangle. " + (3 - i) + " left.");
                edgesList.add(TriangleEdgeValidator.nextEdge(scanner));
            }

            checkInput = Triangle.isTriangle(edgesList);
            if (!checkInput) {
                System.err.println("It's not a triangle.");
            }
        }
    }
}
