/*
crear un arreglo en el que se ingresen cantidades de dinero, luego para cada cantidad de dinero ingresada
decir cuantos billetes de 100,50,20,10,5,1 se necesitan para cada cantidad de dinero ingresada
 */
package cantidadDeBilletesArreglo;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class CantidadDeBilletesArreglo {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor que cero)"));
        while (longitud <= 0){
            longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor que cero)"));
        }
        int [] vector = new int [longitud];
        System.out.println("Llene el vector con numeros mayores que cero");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese una cantidad de dinero (mayor  que cero) en la posicion "+(i+1)+" : ");
            vector[i]=entrada.nextInt();
            while (vector[i] <= 0){
                System.out.print("ERROR. Ingrese una cantidad de dinero (mayor  que cero) en la posicion "+(i+1)+" : ");
                vector[i] = entrada.nextInt();
            }
        }
        
        //ordenar el arreglo de manera creciente
        int aux;
        for (int i = 0; i < vector.length-1; i++){
            for (int j = 0; j < vector.length-1; j++){
                if (vector[j]> vector[j+1]){
                    aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
        System.out.println("Vector ordenado crecientemente");
        for (int i = 0; i < vector.length; i++){
            System.out.println((i+1)+". "+vector[i]);
        }
        
        // cuantos billetes de cada denominacion necesita cada cifra 
        for (int i = 0; i < vector.length; i++){
            int cien=0, cincuenta=0, veinte=0,diez=0,cinco=0,uno=0;
            cien = vector[i] /100;
            cincuenta =  (vector[i] % 100) / 50;
            veinte = (vector[i] % 100 % 50) / 20;
            diez = (vector[i] % 100 % 50 % 20 ) /10;
            cinco = (vector[i] % 100 % 50 % 20 % 10) / 5;
            uno = (vector[i] % 100 % 50 % 20 % 10 % 5) / 1;
            System.out.println("EL billete de : $"+vector[i]+" contiene "+cien+" billetes de $100, "+cincuenta+" de $50, "+veinte+" de $20, "+diez+" de $10, "+ cinco+" de $5 y "+uno+" billetes de $1");
        }
        
        
    }
    
}
