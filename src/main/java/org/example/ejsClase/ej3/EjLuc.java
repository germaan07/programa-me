package org.example.ejsClase.ej3;
import java.util.Scanner;
public class EjLuc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        while(cont == 0){
            int nRegl = sc.nextInt();
            sc.nextLine();
            if(nRegl == 0){
                cont = 1;
            } else{
                int sumPort = 0;
                for(int i = 0; i < nRegl; i++){
                    int port = sc.nextInt();
                    sumPort = sumPort + port;
                }
                sc.nextLine();
                System.out.println(sumPort -nRegl +1);
            }
        }
    }
}