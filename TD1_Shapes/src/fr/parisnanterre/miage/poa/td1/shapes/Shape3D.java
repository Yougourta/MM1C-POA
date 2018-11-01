package fr.parisnanterre.miage.poa.td1.shapes;

import api.Mesurable3D;

public abstract class Shape3D extends Shape implements Mesurable3D {

    private static final double pi = Math.PI;

    public abstract double volume();

    public static double getPi() {
        return pi;
    }
}
