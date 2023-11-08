/*
metodo shell 
El método Shell es un algoritmo de ordenamiento que lleva 
el nombre de su inventor, Donald Shell. Fue uno de los primeros 
algoritmos en superar la barrera del tiempo en el ordenamiento. 
El método Shell mejora el rendimiento del algoritmo de ordenamiento 
por inserción al reducir el número de comparaciones y movimientos de elementos.
El método Shell utiliza una secuencia de brechas (gaps) para dividir el arreglo 
en subarreglos más pequeños. Luego, se aplica el algoritmo de ordenamiento por 
inserción en cada subarreglo. A medida que el algoritmo avanza, las brechas se 
reducen gradualmente hasta que el arreglo se ordena completamente.
*/
package metodoShell;


public class MetodoShell {
    public static void main(String [] args){
         int[] arreglo = {9, 5, 1, 8, 3, 7, 2, 6, 4};

        int brecha = arreglo.length / 2;
        while (brecha > 0) {
            for (int i = brecha; i < arreglo.length; i++) {
                int temp = arreglo[i];
                int j = i;
                while (j >= brecha && arreglo[j - brecha] > temp) {
                    arreglo[j] = arreglo[j - brecha];
                    j -= brecha;
                }
                arreglo[j] = temp;
            }
            brecha /= 2;
        }

        // Imprimir el arreglo ordenado
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    
    }
}
