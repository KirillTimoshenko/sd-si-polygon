import java.util.Scanner;

public class TriangleEdgeValidator {

    public static double nextEdge(Scanner scanner) {
        double edge;
        while (true) {
            if (scanner.hasNextDouble()) {
                edge = scanner.nextDouble();
                if (edge > 0) {
                    break;
                } else {
                    printErrorMessage("Edge can't be less than 0.");
                    scanner.nextLine();
                }
            } else {
                printErrorMessage("Invalid triangle edge.");
                scanner.nextLine();
            }
        }
        return edge;
    }

    private static void printErrorMessage(String message) {
        System.err.println(message);
        System.out.println("Please, enter the edge of the triangle: ");
    }
}
