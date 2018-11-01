package fr.parisnanterre.miage.poa.td1.shapes;

public abstract class Shape {
    private String name;

    @Override
    public String toString() {
        return "Shape: "+this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}