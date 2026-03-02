package org.example.ejsClase.ej5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PantSet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int m = sc.nextInt(); //Columnas
            int n = sc.nextInt(); //Filas
            sc.nextLine();

            if (m == 0 && n == 0){
                break; //Si es 0 0 se rompe
            }

            boolean moreTwoLetters = false;

            if (m % 8 == 0 && n % 8 == 0 && m < 48 && n < 48) {
                int columDe8 = m / 8; //Dividimos las columnas de la pantalla en columnas de 8
                int filasDe8 = n / 8; //Dividimos las filas de la pantalla en filas de 8

                for (int i = 0; i < filasDe8; i++) {

                    for (int j = 0; j < columDe8; j++) {
                        int numColumna = 8 * j; //Recorremos la pantalla en rangos de 8 (0-7, 8-15,...)
                        int numFila = 8 * i; //Empiezan siendo ambos 0, pero luego incrementan
                        char[][] pantalla = new char[n][m];

                        Set<String> letrasUsadas = new HashSet<>(); //Creamos un set con todas las letras usadas en la pantalla

                        for (int fila = numFila; fila < 8 + numFila; fila++) {
                            for (int columna = numColumna; columna < 8 + numColumna; columna++) {
                                //Dividimos la pantalla en bloques de 8x8 y agregamos una letra.
                                String letra = sc.nextLine();
                                if (!letrasUsadas.contains(letra)){
                                    //Si no está en el Set la añadimos
                                    letrasUsadas.add(letra);
                                    if (letrasUsadas.size() > 2){
                                        //Comprobamos que no hayan más de dos letras, si es así hacemos un break
                                        moreTwoLetters = true;
                                        System.out.println("NO");
                                        break; //Finalizamos el bucle for correspondiente
                                    }
                                }
                            }
                            if (moreTwoLetters) {
                                break; //Finalizamos el bucle for correspondiente
                            }
                        }
                        if (moreTwoLetters) {
                            break; //Finalizamos el bucle for correspondiente
                        }
                    }
                    if (moreTwoLetters) {
                        break; //Finalizamos el bucle for correspondiente
                    }
                }
                if (!moreTwoLetters){
                    System.out.println("SI");
                }
            }else{
                System.out.println("NO");
                break;
            }
            sc.next();
            sc.next();
        }
    }
}