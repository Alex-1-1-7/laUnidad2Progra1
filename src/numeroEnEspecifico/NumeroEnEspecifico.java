/*
crear un vector, llenarlo y ordenarlo, mostrar el vector ordenado y 
luego pedirle al usuario que numero quieres ver, debe pedir la posicion del 
numero en el vector y luego de ese numero decir la psoicion del numero que 
quiere ver especificamente, asi
vector = 123, 234, 345 y pedir cual de los tres numero quiere ver
si pidio el 234 luego pedirle la posicion del numero en especifico que quiere ver
por ejemplo ingresa 2 y se debe mostrar e numero 3 
*/

package numeroEnEspecifico;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class NumeroEnEspecifico {
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
        
        //ordenar el vector de manera creciente 4,3
        System.out.println("");
        System.out.println("EL vector ordenado de manera creciente ");
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j]>vector[j+1]){
                     aux = vector[j];
                     vector[j] = vector[j+1];
                     vector[j+1] = aux;
                }
            }
        }
        //imprimir el arreglo ya ordenado
        for (int i = 0; i < vector.length; i++){
            System.out.println("El numero en la posicion "+(i+1)+" ahora es: "+vector[i]);
        }
        
        // pedir la posicion del numero que desea 
        System.out.println("");
        int posicion;
        System.out.print("Ingrese la posicion del numero que desea entre 1 y "+longitud+" : ");
        posicion =  entrada.nextInt();
        while (posicion <=0 || posicion > longitud){
            System.out.print("ERROR. Ingrese la posicion del numero que desea entre 1 y "+longitud+" : ");
            posicion = entrada.nextInt();
        }
        // mostrar  el numero de la posicion ingresada
        int  numero=0;
        for (int i = 0; i < vector.length; i++){
            numero = vector[posicion-1];
        } 
        System.out.println("El numero en la posicion "+posicion+ " es: "+numero);
        
        // ver cuentos digitos tiene el numero
        System.out.println("Ademas. ");
        int numAux = numero;
        int contador=0;
        while (numAux>0){
            numAux /=10;
            contador++;
        }
        System.out.println("El numero: "+numero+" tiene: "+contador+" digitos");
        
         // pedir numero en especifico
         System.out.println("");
         int especifico;
         System.out.print("Ingrese la posicion entre 1 y "+contador+" de el numero que desea ver ("+numero+") : ");
         especifico = entrada.nextInt();
         while (especifico <= 0 || especifico > contador){
             System.out.print("ERROR. Ingrese la posicion entre 1 y "+contador+" de el numero que desea ver ("+numero+") : ");
             especifico = entrada.nextInt();
         }
         //convertir  el numer a String
         String num;
         char numEspe;
         num = String.valueOf(numero);
         numEspe = num.charAt(especifico-1);
         System.out.println("El numero en especifico en la posicion "+especifico+" es: "+numEspe);
    }
    
}
