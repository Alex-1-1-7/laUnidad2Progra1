/*
 metodo por insercion
*/
package metodoPorInsercion;

import java.util.Scanner;


public class MetodoPorInsercion {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        int longitud,pos,aux;
        System.out.println("Ingrese la longitud del vector");
        longitud = entrada.nextInt();
        int [] vector = new int [longitud];
        
        System.out.println("Llene el vector:");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" :");
            vector[i] = entrada.nextInt();
        }
        //int numeros [] = {5, 7, 3, 4, 6, 2, 3};
        for (int i = 0; i < vector.length; i++){
            pos = i;
            aux = vector[i];
            //7 
            //3
            while ((pos>0) && vector[pos-1] > aux){
                  //  1         5           > 7 NO
                  //  2         7           > 3 SI
                vector [pos] = vector [pos-1];
                    // 3     = 7 
                pos --;
            }
            //refrescar el numero actual
            vector [pos] = aux;
        }
        System.out.println("El vector arreglado de forma creciente");
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
        }
        System.out.println("El vector arreglado de forma decreciente");
        for (int i = (vector.length-1); i >= 0 ; i--){
            System.out.println(vector[i]);
        }
        
    }
    
}
