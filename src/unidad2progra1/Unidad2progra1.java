/*
crear un vector y llenarlo, luego pedir un numero  y buscarlo  en el vector, si esta 
en el vector se  debe indicar enque posicion esta dicho numero y si hay repetidos decir 
cuantos repetidos hay, y si no decir que el numero no se encuentra
*/
package unidad2progra1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Unidad2progra1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int longitud, numero, contador=0; 
        
        longitud =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector"));
        int vector [] = new int [longitud];
        
        System.out.println("Llene el vector con numeros enteros positivos ");
        for (int i =  0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i]<0){
                System.out.print("EEROR. Ingrese un numero positivo en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        boolean siEsta = false;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si se  encuentra en el  vector"));
        for  (int i = 0; i < vector.length; i++){
            if (vector[i]==numero){
                contador++;
                System.out.println("EL numero: "+numero+" esta en la posicion "+(i+1));
                siEsta = true;
                
            }
            
        }
        if (siEsta){
            System.out.println("Y esta "+contador+ " veces");
        }
        if (!siEsta){
            System.out.println("EL numero: "+numero+" NO esta en el vector ");
        }
        
        
    }
    
}
