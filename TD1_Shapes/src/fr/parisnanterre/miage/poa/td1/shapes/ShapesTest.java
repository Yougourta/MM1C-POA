package fr.parisnanterre.miage.poa.td1.shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,1);
        Square square = new Square(5,5);
        Rectangle rectangle = new Rectangle(2,10);

        Point3D point3D = new Point3D(1,1,1);
        Sphere sphere = new Sphere(5, point3D);
        RevolutionCone revolutionCone = new RevolutionCone(5, 5, point3D);

        System.out.println(square.toString());
        System.out.println(rectangle.toString());

        System.out.println(sphere.toString());
        System.out.println(revolutionCone.toString());

    }
}
