package fr.parisnanterre.miage.poa.td1.shapes;

public class RevolutionCone extends Shape3D {
    private double height = 0;
    private double radius;
    private Point3D center;

    public RevolutionCone() {
        super();
        super.setName("RevolutionCone");
        radius = 0;
        center = new Point3D(0,0,0);

    }

    public RevolutionCone(double height, double radius, Point3D center) {
        super();
        super.setName("RevolutionCone");
        this.height = height;
        this.radius = radius;
        this.center = center;
    }

    public double apotherm(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape: "+getName()+", radius: "+getRadius()+", center: ("+center.getX()+","+center.getY()+","+center.getZ()+"), height: "+getHeight();
    }

    @Override
    public double volume() {
        return (1/3) * getPi() * Math.pow(getRadius(), 2) * getHeight();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point3D getCentre() {
        return center;
    }

    public void setCentre(Point3D centre) {
        this.center = centre;
    }
}
