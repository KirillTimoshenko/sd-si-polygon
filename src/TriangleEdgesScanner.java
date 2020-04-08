import java.util.ArrayList;
import java.util.InputMismatchException;
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

    public void scanInputEdges() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the edges of the triangle: ");
        for (int i = 0; i < 3; ++i) {
            edgesList.add(scanner.nextDouble());
        }
    }
}
