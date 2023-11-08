/*
histograma 
*/
package histograma;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Histograma {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        int longitud;
        longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del que tendra el histograma. "));
        int histograma [] = new int [longitud];
        
        JOptionPane.showMessageDialog(null, "Llene cada posicion del histograma ");
        for (int i = 0; i < histograma.length; i++){
            System.out.print("Ingrese un numero en la posicion: "+(i+1)+" : ");
            histograma [i] = entrada.nextInt();
        }
        for (int i = 0; i < histograma.length; i++){
            String histogramaa = " ";
            for (int j = 0; j < histograma[i]; j++){
                histogramaa += " X ";
                
            }
            System.out.println(histogramaa);
        }
        
    }
    
}
