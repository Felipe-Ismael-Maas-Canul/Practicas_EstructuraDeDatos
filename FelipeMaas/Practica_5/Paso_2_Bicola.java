package FelipeMaas.Practica_5;

import javax.swing.JOptionPane;
    public class Paso_2_Bicola {

    public static void main(String[] args) throws IOException {

        int Opcion = 0, el;
        Bicola bi = new Bicola();
        do {

            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar dato a la derecha\n" + 
                        "2. Insertar dato a la izquierda \n" +  
                        "3. Eliminar a la derecha \n"+ 
                        "4. Eliminar a la izquierda \n" + 
                        "5. Imprimir bicola \n" + 
                        "6. Numero de datos \n" + 
                        "7. Salir \n"));

                Opcion = Integer.parseInt(entrada.readLine());

                switch (Opcion){

                    case 1:
                        el = Integer.parseInt(JOptionPane.showInputDialog( " Ingresa el dato : "));
                        bi.InsertarDerecha(el);
                        break;

                    case 2:
                        el = Integer.parseInt(JOptionPane.showInputDialog( " Ingresa el dato : "));
                        bi.InsertarIzquierda(el);
                        break;

                    case 3:

                    el = Integer.parseInt(JOptionPane.showInputDialog (" Ingresa el dato a eliminar: "));
                    if
                            (bi.MostrarBicola(el)){
                            bi.EliminarDerecha();
                            JOptionPane.showMessageDialog(null, " el elemento eliminado es: " + el);
                    }
                        break;
                        
                    case 4:
                    el = Integer.parseInt(JOptionPane.showInputDialog (" Ingresa el dato a eliminar: "));
                    if
                            (bi.MostrarBicola(el)){
                            bi.EliminarIzquierda();
                            JOptionPane.showMessageDialog(null, " el elemento eliminado es: " + el);
                    }   
                    break;

                    case 5:
                        
                        bi.MostrarBicola();
                        break;

                    case 6:
                        ("Tamaño de la Bicola es: " + bicola.TamBicola());
                        break;

                    case 7:
                        System.out.println("Salir");
                        break;
                    default:
                        break;
                }
            } catch (NumberFormatException n) {
                System.out.println("Error" + n.getMessage());
            }
        } while (Opciones != 7);
    }
}
