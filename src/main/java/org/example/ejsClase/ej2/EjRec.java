package org.example.ejsClase.ej2;
import java.util.Scanner;
public class EjRec{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int areNumNeg = 0;
        while(areNumNeg == 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            if(x < 0 || y < 0){
                areNumNeg = 1;
            } else{
                System.out.println(x*2 + y*2);
            }
        }
    }
}