/*
declarar 2 vectores y rellenarlos, luego de llenarlos 
intermabiar los valores de los vectores, los valores del vector uno pasan a ser
del vector 2 y viceversa.
 */
package intercambioDeValores;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class IntercambioDeValores {
    public static void main (String [] args){
        Scanner entrada = new  Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud que desea que tenga el vector "));
        int [] vectorA  = new int [longitud];
        int [] vectorB = new int [longitud];
        System.out.println("Llene el vector A ");
        for (int i = 0; i < vectorA.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vectorA [i] = entrada.nextInt();
        }
        System.out.println("Llene el vector B ");
        for (int i = 0; i < vectorA.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vectorB [i] = entrada.nextInt();
        }
        int aux;
        for (int i = 0; i < vectorA.length; i++){
            aux = vectorA[i];
            vectorA [i] = vectorB[i];
            vectorB [i] = aux;
        }
        System.out.println("Ahora los vectores quedan de la siguiente manera: ");
        System.out.println("Vector A");
        for (int i = 0; i < vectorA.length; i++){
            System.out.println(vectorA[i]);
        }
        System.out.println("Vector B ");
        for (int i = 0; i < vectorA.length; i++){
            System.out.println(vectorB[i]);
        }
    }
}
