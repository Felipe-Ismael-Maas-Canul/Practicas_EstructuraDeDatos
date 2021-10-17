package FelipeMaas.Practica_4;

import javax.swing.JOptionPane;

public class Practica_4_Lista {
    public static void main(String[]args){
        //Primero se crea un nuevo atributo en este caso List
        //Asi como igual se define el in, siendo "el"
        //Para asi poder ingresar el dato
        Lista List = new Lista();
        int Opcion = 0, el;

        do{
            try{
                //Con respecto a esta parte, se crea e imprime un menu, en este caso con 8 opciones
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "1. Agregar un elemento la inicio de la lista\n" +
                "2. Insertar elemento al final\n" + 
                "3. Mostrar Los Datos de la Lista\n" +
                "4. Eliminar un elemento al inicio de la lista\n" + 
                "5. Eliminar un lemento al final de la lista\n" +
                "6. Eliminar un elemento especifico\n" +
                "7. Buscar elemento\n"+
                "8. Salir " + "menu de opciones" ));

                switch(Opcion){
                    //En el primer caso, se importa en metodo agregar al inicio 
                    //Perteneciente a la lista en la cual nos permite ingresar un dato en al inicio 
                    case 1:
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog( " Ingresa el dato : "));
                            List.agregarAlinicio(el);

                        }
                        catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null, " Error ");
                    }
                        break;

                    case 2:
                    //En el segundo caso, se importa en metodo agregar al final 
                    //Perteneciente a la lista en la cual nos permite ingresar un dato en al inicio
                        try{
                            el = Integer.parseInt(JOptionPane.showInputDialog (" Ingresa el dato: "));
                            List.agregarAlfin(el);
                        }
                        catch (NumberFormatException n){
                            JOptionPane.showMessageDialog(null, " Error ");
                        }
                        break;

                    case 3:
                    //En el tercer caso se importa el mostrar lista, la cual cuando ya hayas agregado los numero
                    //suficientes a la lista, este nos permite imprimirlos
                            List.mostrarLista();
                        break;

                    case 4:
                    //En el cuarto caso se importa el Eliminar inicio, lo cual nos permite borrar
                    //El o los datos de la lista
                            el = List.eliminarInicio();
                            JOptionPane.showMessageDialog(null, "el dato es " + el);
                        break;

                    case 5:
                    //En el quinto caso se importa el Eliminar fin, lo cual nos permite borrar
                    //El o los datos de la lista
                            el = List.eliminarFin();
                            JOptionPane.showMessageDialog(null, "el dato es " + el);
                        break;
                        
                    case 6:
                    //En el septimo caso se importan dos metodos que son
                    //El buscar elemento y Eliminar, lo cual nos permite primero buscar
                    //Para posteriormente borrar el o los datos de la lista
                            el = Integer.parseInt(JOptionPane.showInputDialog (" Ingresa el dato a eliminar: "));
                    if
                            (List.buscarElemento(el)){
                            List.eliminar(el);
                            JOptionPane.showMessageDialog(null, " el elemento eliminado es: " + el);
                    }
                    else
                    //En esta parte si el dato a buscar no esta, nos arroje un mensaje
                    //De que no se encontro el dato
                            JOptionPane.showMessageDialog(null, " El elemento "+ el + " No se encuentra: ");
                        break;

                    case 7:
                    //En el septimo caso solo importa el buscar dato, ya que esa es la funcion que se busca hacer
                    //Este paso al ingresar un numero que se encuentre este te imprime que si esta en la lista enlazada
                    //Y al ingresar un dato que no se encuentre, este arroja que no se encuentra en la lista enlazada
                            el = Integer.parseInt(JOptionPane.showInputDialog(" Ingresa el elemento a buscar: "));
                    if
                            (List.buscarElemento(el))
                            JOptionPane.showMessageDialog(null," El elemento " + el + " Se encuentra en la lista enlazada ");
                    else 
                            JOptionPane.showMessageDialog(null,"El elemento" + el + " No se encunetra en la lsita enlazada ");
                        break;

                    case 8: 
                        break; 
                        default:
                        JOptionPane.showMessageDialog(null, "Error");
                        }
            }catch(Exception e){ 
                        //Este JOptionpane, es para que cualquier cosa que hagas que no es lo que se pude te arroje
                        //Un mensaje de error
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());     
            }
        }while(Opcion!= 8);
    }
}