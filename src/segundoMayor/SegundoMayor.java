/*
encontrar el segundo numero mayor en un arreglo
*/
package segundoMayor;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SegundoMayor {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud,mayor=0,segundo=0;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  longitud del arreglo"));
        int vector[] = new int [longitud];
        JOptionPane.showMessageDialog(null, "Llene el vector con numeros enteros");
        for (int i = 0; i < vector.length; i++){
            System.out.println("Ingrese un numero en la posicon "+(i+1)+" : ");
            vector [i] = entrada.nextInt();
        }
        //encontrar el mayor 
        for (int i = 0; i < vector.length; i++){
            if (mayor<vector[i] && vector[i] > segundo){
                mayor = vector[i];
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        //segundo mauyor
        for (int i = 0; i < vector.length; i++){
            if (vector[i] < mayor && vector[i] > segundo){
                segundo = vector[i];
            }
        }
        System.out.println("EL segundo mayor es: "+segundo);
    }
    
}
