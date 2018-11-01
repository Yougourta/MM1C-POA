package fr.parisnanterre.miage.poa.td1.shapes;

public class Sphere extends Shape3D{

    private double radius = 0;
    private Point3D center;

    public Sphere() {
        super();
        super.setName("Sphere");
        center = new Point3D(0, 0, 0);
    }

    public Sphere(double radius, Point3D center) {
        super();
        super.setName("Sphere");
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "Shape: "+getName()+", radius: "+getRadius()+", center: ("+center.getX()+","+center.getY()+","+center.getZ()+")";
    }

    @Override
    public double volume() {
        return (4.0/3.0) * getPi() * Math.pow(getRadius(), 3 );
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point3D getCenter() {
        return center;
    }

    public void setCenter(Point3D center) {
        this.center = center;
    }
}
