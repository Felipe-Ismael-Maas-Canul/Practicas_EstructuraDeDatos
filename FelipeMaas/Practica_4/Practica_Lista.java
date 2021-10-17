package FelipeMaas.Practica_4;

import javax.swing.JOptionPane;

public class Practica_Lista {
    public static void main(String[] args) {
        int opcion = 0, el;
        Lista Listita = new Lista();
        do{

            try{
                opcion = Integer.parseInt(JOptionPane.showMessageDialog(null, "1. Agregar un elemento la inicio de la lista\n" + 
                "2. Insertar elemento al final\n" + 
                "3. Mostrar Los Datos de la Lista\n" ));

                switch(opcion){
                    case 1:
                    try{
                        el = Integer.parseInt(JOptionPane.showMessageDialog(null, "ingresa el dato"));
                        Listita.agregarAlinicio(el);
                        catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, "error");
                        }
                        break;
                        case 2:
                        Listita.mostrarLista();
                        break;
                        case 3:
                        break;
                        default:
                        JOptionPane.showMessageDialog(null, "esta mal");
                    }
                }catch (Exception e){
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage());
                }
            }while(opcion!= 3);
        }
    }