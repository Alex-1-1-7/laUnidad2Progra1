/*
crear un vector, llenarlo de numeros enteros y ordenarlos de manera creciente
y luego a esos numeros darles la vuelta como en el parcial
podria tambien decir cuantos digitos tiene cada numero
*/
package darleLaVueltaAlNum;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class DarleLaVueltaAlNum {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor  a cero)"));
        while (longitud <= 0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del  vector (mayor a cero)"));
        }
        int [] vector  = new int [longitud];
        
        //llenar el vector
        System.out.println("Llene el vector con numeros positivos");
        for  (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i]<=0){
                System.out.print("ERROR. Ingrese un numero en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        
        //ordenar los numeros de manera creciente  4,3
        System.out.println("");
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j] > vector [j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        // imprimir el arreglo ordenado
        System.out.println("El vector ordenado  de manera creciente queda asi: ");
        for (int i = 0; i < vector.length; i++){
            System.out.println("El numero en la posicion "+(i+1)+" es: "+vector[i]);
        }
        
        //cuantos digitos tiene cada numero del arreglo
        System.out.println("");
        System.out.println("Cantidad de digitos");
        for (int i = 0; i <  vector.length; i++){
            int temp = vector[i];
            int contador=0;
            while(temp != 0){
                temp /= 10;
                contador++;
            }
            System.out.println("El numero: "+vector[i]+" tiene "+contador+" digitos");
        }
        
        // darles la vuelta a los numeros ingresados
        System.out.println("");
        System.out.println("Numeros al reves ");
        for (int i  = 0; i < vector.length; i++){
            int auxiliar = vector[i];
            int digito, numReves=0;
                while (auxiliar >  0){
                    //1234
                    digito = auxiliar %  10;
                    numReves = numReves * 10 + digito;
                    auxiliar/= 10;
                }
            System.out.println("El numero "+vector[i]+" al reves es: "+numReves);
            
        }
        
        
    }
    
}
