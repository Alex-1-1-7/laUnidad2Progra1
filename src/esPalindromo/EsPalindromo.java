/*
  llenas un vector, ordenarlo y decir si esos numeros son palindromos 
*/
package esPalindromo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class EsPalindromo {
    public  static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector (mayor a cero)"));
        while (longitud <=0 ){
           longitud = Integer.parseInt(JOptionPane.showInputDialog("ERROR. Ingrese la longitud del vector (mayor a cero)"));
        }
        int [] vector = new int [longitud];
        
        //llenar el vector
        System.out.println("Llene el vector con numero enteros positivos");
        for (int i = 0; i < vector.length; i++){
            System.out.print("Ingrese un numero en la posicion "+(i+1)+" : ");
            vector[i] = entrada.nextInt();
            while (vector[i]<=0){
                System.out.print("ERROR. Ingrese un numero en la posicion "+(i+1)+" : ");
            }
        }
        
        //ordenar el  vector  4,3
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
        
        //mostrar el vector ya ordenado
        System.out.println("El vector ordenado de manera creciente queda asi: ");
        for (int i = 0; i < vector.length; i++){
            System.out.println("El numero en la posicion "+(i+1)+" es: "+vector[i]);
        }
        
        // decir si los numeros son palindromos o no
        String palindromo; 
        for (int i = 0; i < vector.length; i++){
            boolean siEs = true;
            palindromo = String.valueOf(vector[i]);
            for (int j = 0; j < palindromo.length(); j++){
                if (palindromo.charAt(j) != palindromo.charAt(palindromo.length()-1-j)){
                    siEs = false;
                    break;
                }
            }
            if (siEs){
                System.out.println("El numero: "+vector[i]+" SI es palindromo");
            } else {
                System.out.println("El numero: "+vector[i]+" NO es palindromo");
            }
        }
        

    }
    
}
