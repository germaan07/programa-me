package org.example.ejsClase.ej5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pant2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Set<String> LETRAS =  new HashSet<>();
        addLetras(LETRAS);
        while (true){
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m == 0 && n == 0){
               break;
            }
            boolean wA = false;

            char[][] pantalla = new char[n][m];
            for (int fila = 0; fila < n; fila++) {
                String linea = sc.next();
                linea = linea.toUpperCase();
                for (int columna = 0; columna < m; columna++) {
                    char letra = linea.charAt(columna);
                    pantalla[fila][columna] = letra;
                    if (!LETRAS.contains(String.valueOf(letra))){
                        wA = true;
                    }
                }
            }
            if (!wA){
                if (m % 8 == 0 && n % 8 == 0 && m < 48 && n < 48) {
                    int columDe8 = m / 8;
                    int filasDe8 = n / 8;

                    int numFila = 0;
                    int numColumna = 0;

                    for (int i = 0; i < filasDe8; i++) {
                        if (!wA){
                            for (int j = 0; j < columDe8; j++) {
                                numColumna = 8 * j;
                                numFila = 8 * i;
                                Set<String> letrasUsadas = new HashSet<>();
                                //Creamos un set con todas las letras usadas en la pantalla
                                if (!wA){
                                    for (int fila = numFila; fila < 8 + numFila; fila++) {
                                        if (!wA){
                                            for (int columna = numColumna; columna < 8 + numColumna; columna++) {
                                                String imagen = String.valueOf(pantalla[fila][columna]);
                                                if (!letrasUsadas.contains(imagen)) {
                                                    //Si no está en el Set la añadimos
                                                    letrasUsadas.add(imagen);
                                                    if (letrasUsadas.size() > 2) {
                                                        //Comprobamos que no hayan más de dos letras, si es así hacemos
                                                        // un break
                                                        wA = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }

                }
            }
            if (!wA) {
                System.out.println("SI");
            }else {
                System.out.println("NO");
            }
        }
    }

    private static void addLetras(Set<String> LETRAS) {
        LETRAS.add("A");
        LETRAS.add("B");
        LETRAS.add("C");
        LETRAS.add("D");
        LETRAS.add("E");
        LETRAS.add("F");
        LETRAS.add("G");
        LETRAS.add("H");
        LETRAS.add("I");
        LETRAS.add("J");
        LETRAS.add("K");
        LETRAS.add("L");
        LETRAS.add("M");
        LETRAS.add("N");
        LETRAS.add("O");
    }
}
