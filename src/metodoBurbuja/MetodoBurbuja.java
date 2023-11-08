/*
metodo de ordenamiento de burbuja
*/
package metodoBurbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbuja {
    public static void main(String [] args){
        Scanner entrada = new Scanner (System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector."));
        int [] vector = new int [longitud];
        System.out.println("Llene el vector");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero positivo en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while(vector[i]<0){
                System.out.println("ERROR. Ingrese un numero positivo en la posicion: "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        //metodo burbuja  4,3 
        int aux;
        System.out.println("Creciente");
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j] > vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        for (int i =0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        
        
        int auxi;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j] < vector[j+1]){
                    auxi = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = auxi;
                }
            }
        }
        System.out.println("Decreciente");
        for (int i =0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        
        
    }
    
}
