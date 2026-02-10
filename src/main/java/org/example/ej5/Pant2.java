package org.example.ej5;

import java.util.Scanner;

public class Pant2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean cont = true;
        do {
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m == 0 && n == 0){
                cont = false;
            } else if (m % 8 == 0 && n % 8 == 0 && m < 48 && n < 48) {
                boolean moreTwoLetters = false;
                char[][] pantalla = new char[n][m];
                for (int fila = 0; fila < n; fila++) {
                    for (int columna = 0; columna < m; columna++) {
                        char letra = sc.next().charAt(0);
                        pantalla[fila][columna] = letra;
                    }
                }

                int columDe8 = m/8;
                int filasDe8 = n/8;

                int numFila = 0;
                int numColumna = 0;

                for (int i = 0; i < filasDe8; i++) {
                    for (int j = 0; j < columDe8; j++){
                        numColumna = 8 * j;
                        numFila = 8 * i;
                        char letra1 = pantalla[numFila][numColumna];
                        char letra2 = 0;
                        for (int fila = numFila; fila < 8 + numFila; fila++) {
                            for (int columna = numColumna; columna < 8 + numColumna; columna++) {
                                char imagen = pantalla[fila][columna];
                                if (imagen!= letra1){
                                    if (letra2 == 0){
                                        letra2 = imagen;
                                    }else {
                                        if (imagen != letra2){
                                            moreTwoLetters = true;
                                            System.out.println("NO");
                                            cont = false;
                                            j = columDe8;
                                            i = filasDe8;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!moreTwoLetters){
                    System.out.println("SI");
                }
            } else {
                cont = true;
                System.out.println("Error");
            }
        } while (cont);
    }
}
