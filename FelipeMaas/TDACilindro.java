package FelipeMaas;

public class TDACilindro {
    private double radio;
    private double altura;

    public TDACilindro(double radioIni, double alturaIni){
        if (radioIni>0 && alturaIni>0)
    {
    this.radio = radioIni;
    this.altura = alturaIni;
    }
    else
    {
        this.radio = 0.0;
        this.radio = 0.0;
    }
}

//Metodos
public double getRadio(){
    return this.radio;
}
public double getAtura(){
    return this.altura;
}
public double getAreaLateral(){
    return (2*Math.PI*radio*altura);
}
public double getAreaBase(){
return (Math.PI*Math.pow(radio,2));
}
public double getAreaTotal(){
    return (getAreaLateral() + 2 * getAreaBase());
}
public double getVolumen(){
    return (Math.PI*Math.pow(radio, 2) * getAtura());
    }
}