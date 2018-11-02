package fr.parisnanterre.miage.poa.td1.shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Shape2D point2D = new Point2D(1,1);
        Shape2D square = new Square(5,5);
        Shape2D rectangle = new Rectangle(2,10);

        Shape3D point3D = new Point3D(1,1,1);
        Shape3D sphere = new Sphere(5, (Point3D) point3D);
        Shape3D revolutionCone = new RevolutionCone(5, 5, (Point3D) point3D);

        System.out.println(square.toString());
        System.out.println(rectangle.toString());

        System.out.println(sphere.toString());
        System.out.println(revolutionCone.toString());

    }
}
