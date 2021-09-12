package FelipeMaas;

public class Cubo {

    private double base;
    private double altura;
    private double ancho;

    public Cubo (double baseIni, double alturaIni, double anchoIni){
        if (baseIni>0 && alturaIni>0 && anchoIni>0){

            this.base = baseIni;
            this.altura = alturaIni;
            this.ancho = anchoIni;
        }
        else
        {
            this.base = 0.0;
            this.altura = 0.0;
            this.ancho = 0.0;
        }
    }
    //Metodos 
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getAncho(){
        return this.ancho;
    }

    public double getVolumen(){
        return (base * altura * ancho );
    }

    public double getArea(){
        return(base * altura);
    }

    public double getAreaTotal(){
        return(getArea() * 6);

    }
}