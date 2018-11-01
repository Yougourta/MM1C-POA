package fr.parisnanterre.miage.poa.td1.shapes;

public class Rectangle extends Shape2D {
    private int length, width;

    public Rectangle(){
        super();
        super.setName("Rectangle");
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        super();
        super.setName("Rectangle");
        this.length = length;
        this.width = width;
    }

    public Rectangle(int length, int width, String name) {
        super();
        super.setName(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){ return "Shape: "+super.getName()+", length: "+this.getLength()+", width: "+this.getWidth(); }

    @Override
    public double surface(){ return this.getWidth()*this.getLength(); }

    @Override
    public double perimeter() { return 2*(this.getLength()+this.getWidth()); }

    public double diagonal(){ return Math.sqrt(Math.pow(this.getLength(),2)+Math.pow(this.getWidth(),2)); }

    //Accessors
    public int getLength() { return length; }

    public void setLength(int length) { this.length = length; }

    public int getWidth() { return width; }

    public void setWidth(int width) { this.width = width; }
}
