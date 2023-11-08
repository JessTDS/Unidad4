
package practica2;


public class Practica2 {

    
    public static void main(String[] args) {
        char [][] tab = new char [3][5];
        
        char letra = 'a';
        for (int filas = 0; filas < 3; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                
                tab[filas][columnas]=letra;
                letra++;
            }
        }
        for (int fila1 = 0; fila1 < 3; fila1++) {
            for (int columna1 = 0; columna1 < 5; columna1++) {
                System.out.print(tab[fila1][columna1] + " ");
            }
            System.out.println();
        }
    }
    
}
