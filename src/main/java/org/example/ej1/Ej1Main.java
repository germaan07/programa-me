package org.example.ej1;

import java.util.Scanner;

public class Ej1Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce cuántas veeces quieres mostrar el mensaje");
        var numVec = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numVec; i++){
            System.out.println("Hola Mundo");
        }
    }
}
