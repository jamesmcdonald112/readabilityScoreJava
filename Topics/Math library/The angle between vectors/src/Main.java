import java.util.Scanner;

class Main {

    /*
    Find the dot product (which is x1*x2 + y1*y2 where x and y are the components of given vectors),
    then find the length of both vectors (sqrt(x^2+y^2)),
    and then plug them into cosine formula (dot product/(length of the first vector* length of the second vector)), take an arccosine of that and convert it to degrees. There is your answer
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values for the first vector
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();

        // Read input values for the second vector
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        // Calculate the dot product
        double dotProduct = a1 * b1 + a2 * b2;

        // Calculate the magnitudes of the vectors
        double magnitudeA = Math.sqrt(a1 * a1 + a2 * a2);
        double magnitudeB = Math.sqrt(b1 * b1 + b2 * b2);

        // Calculate the cosine of the angle
        double cosTheta = dotProduct / (magnitudeA * magnitudeB);

        // Ensure the value is within the valid range for arccos due to floating-point precision
        cosTheta = Math.max(-1.0, Math.min(1.0, cosTheta));

        // Calculate the angle in radians
        double angleRadians = Math.acos(cosTheta);

        // Convert the angle to degrees
        double angleDegrees = Math.toDegrees(angleRadians);

        // Print the output
        System.out.printf("%.8f\n", angleDegrees);

        scanner.close();
    }
}