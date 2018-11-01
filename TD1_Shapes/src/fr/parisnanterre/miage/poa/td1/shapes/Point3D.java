package fr.parisnanterre.miage.poa.td1.shapes;

import fr.parisnanterre.miage.poa.td1.api.Translatable3D;

public class Point3D extends Shape3D implements Translatable3D{
    private int x;
    private int y;
    private int z;

    public Point3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super();
        super.setName("Point3D");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public boolean isOrigin(){
        return (this.x == 0) && (this.y == 0) && (this.z == 0);
    }

    public double distance(Point3D p){
        return Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2)+Math.pow(this.z-p.getZ(),2));
    }

    @Override
    public void translate(int x, int y, int z){
        this.setX(x);
        this.setY(y);
        this.setY(z);
    }

    @Override
    public String toString() { return "Shape: "+super.getName()+" X: "+this.getX()+" Y: "+this.getY()+" Z: "+this.getZ(); }

    //Accessors
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() { return z; }

    public void setZ(int z) { this.z = z; }

    @Override
    public double volume() {
        return 0;
    }
}