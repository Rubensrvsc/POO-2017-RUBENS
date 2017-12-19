package model;

public class Quadrado implements FiguraGeometrica,Comparavel{
    private int lado;

    public Quadrado(int lado){
        this.lado=lado;
    }

    @Override
    public double calculaArea() {
        return this.lado*this.lado;
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }

    @Override
    public int comparar(FiguraGeometrica f) {
        if(this.calculaArea()<f.calculaArea()){
            return -1;
        }if(this.calculaArea()>f.calculaArea()) {
            return 1;
        }
        return 0;
    }
}
