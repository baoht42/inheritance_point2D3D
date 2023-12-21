import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point1 = new Point2D(1.4f, 1.6f);
        Point3D point2 = new Point3D(5,5,6);
        System.out.println("Array for xy of Point2D: " + Arrays.toString(point1.getXY()));
        System.out.println("Array for xyz of Point3D: " + Arrays.toString(point2.getXYZ()));

    }
}