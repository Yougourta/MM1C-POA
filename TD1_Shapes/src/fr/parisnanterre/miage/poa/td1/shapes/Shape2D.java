package fr.parisnanterre.miage.poa.td1.shapes;

import fr.parisnanterre.miage.poa.td1.api.Mesurable2D;

public abstract class Shape2D extends Shape implements Mesurable2D {
    public abstract double surface();
    public abstract double perimeter();
}
