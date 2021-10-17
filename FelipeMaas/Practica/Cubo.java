package FelipeMaas.Practica;

public class Cubo {

//Se declara los atributos en este caso son:
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
    //En estos primeros atributos se crean para mas despues
    //poder asingar el valor de la base, altura y ancho
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getAncho(){
        return this.ancho;
    }

    //Y con estos 3 metodos mas se crean con una formula
    //Que en este caso son volumen, Area y Area total
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