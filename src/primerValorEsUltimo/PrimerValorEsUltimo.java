/*
el primer valor pasa a ser el ultimo, el segundo a ser el penultimo 
ejemplo: 32,24,28,17,19
ahora:   19,24,28,24,32 
*/
package primerValorEsUltimo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PrimerValorEsUltimo {
    public static void main(String [] args ){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector "));
        int vector [] = new int [longitud];
        System.out.println("Llene el vector");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la  posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
        }
        //intercambiar los valores 
        int aux;
        for (int i = 0; i <  vector.length/2; i++){
            aux = vector[i];
            vector[i] = vector[vector.length-1-i];
            vector[vector.length-1-i] = aux;
        }
        System.out.println("Ahora el vector es: ");
        for (int i = 0; i  < vector.length; i++){
            System.out.println("EL numero en la posicion "+(i+1)+" es: "+vector[i]);
        }
        
    }
    
}
