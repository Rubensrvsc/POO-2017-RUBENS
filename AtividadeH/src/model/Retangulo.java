package model;

public class Retangulo implements FiguraGeometrica,Comparavel{
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura){
        this.largura=largura;
        this.altura=altura;
    }

    @Override
    public double calculaArea() {
        return this.largura*this.altura ;
    }

    @Override
    public double perimetro() {
        return (this.largura*2)+(this.altura*2);
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
