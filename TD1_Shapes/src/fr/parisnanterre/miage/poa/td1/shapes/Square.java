package fr.parisnanterre.miage.poa.td1.shapes;

public class Square extends Rectangle{

    public Square(){
        super();
        super.setName("Carre");
    }

    public Square(int length, int width){
        super(length, width, "Carre");
        if (length!=width)
            throw new IllegalArgumentException("length and width must have the same value for fr.parisnanterre.miage.poa.td1.shapes.Square shape !");
    }
}
