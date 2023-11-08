
/*
llenar un vector, ordenar los numeros ingresados y luego decir cuales 
son los numeros multiplos de los numeros ingresados
*/

package sonMultiplos;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SonMultiplos {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor a cero)"));
        while (longitud <= 0){
            longitud  = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor a cero)"));
        }
        int []  vector = new int [longitud];
        
        //llenar el vector
        System.out.println("Llene el vector con numeros enteros positivos");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i] <= 0){
                System.out.print("ERROR. ingrese un numero en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        
        // ordenar el vector 4,3
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j] > vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        // imprimir el arreglo ya ordenado
        System.out.println("El vector ordenado de manera creciente queda asi ");
        for (int i = 0; i < vector.length; i++){
            System.out.println("El numero en la posicion "+(i+1)+" es: "+vector[i]);
        }
        System.out.println("");
        
        // numeros multiplos de los numeros inggresados
        for (int i = 0; i < vector.length; i++){
            int contador=0, resultado;
            System.out.println("El numero "+vector[i]+" tiene los siguientes multiplos:");
            for (int j = 1; j <= vector[i]; j++){
                resultado = vector[i] % j;
                if (resultado == 0 ){
                    System.out.print(j+" -  ");
                    contador++;
                }
            }
            System.out.println("Tiene  "+contador+" multiplos ");
            System.out.println("");
        }
        
        
        
    }
    
    
}
