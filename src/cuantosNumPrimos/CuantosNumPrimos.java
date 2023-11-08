/*
llenar un vector y decir cuales numeros son primos, mostrar el numero que es primo 
 */
package cuantosNumPrimos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CuantosNumPrimos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector "));
        int vector [] = new int[longitud];
        System.out.println("Llene el vector");
        for (int i =0; i < vector.length; i++){
            System.out.print("Ingrese  un numero en la posicion "+(i+1)+" : ");
            vector [i] = entrada.nextInt();
        }
        //cuales numeros son primos
        for (int i = 0; i < vector.length; i++){
            int contador = 0;
            for (int j = 1; j <= vector[i]; j++){
                if (vector[i] % j == 0 ){
                    contador++;
                }
            }
            if (contador==2){
                System.out.println("El numero: "+vector[i]+" ES primo");
            }else  {
                System.out.println("EL numero: "+vector[i]+" NO es primo");
            }
        }
    }
}
