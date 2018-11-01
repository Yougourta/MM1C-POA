package fr.parisnanterre.miage.poa.td1.shapes;

import api.Translatable2D;

public class Point2D extends Shape2D implements Translatable2D {
    private int x;
    private int y;

    public Point2D(){
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int x, int y) {
        super();
        super.setName("Point2D");
        this.x = x;
        this.y = y;
    }

    public boolean isOrigin(){
        return (this.x == 0) && (this.y==0);
    }

    public double distance(Point2D p){
        return Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2));
    }

    @Override
    public void translate(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    @Override
    public String toString() { return "fr.parisnanterre.miage.poa.td1.shapes.Shape: "+super.getName()+" X: "+this.getX()+" Y: "+this.getY(); }

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


    @Override
    public double surface() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

}
