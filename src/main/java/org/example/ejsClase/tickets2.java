package org.example.ejsClase.ej4;

import java.util.Scanner;

public class tickets2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numCasos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numCasos; i++){
            int corrTick = 0;
            while (corrTick == 0){
                long ticket = getTicket(sc);

                long ent = ticket;
                int digTick = getDigTick(ent, 0);
                if (digTick%2 == 0){
                    corrTick = 1;

                    long[] entrada = new long[digTick];
                    long[] e2 = new long[digTick];

                    long ent2 = ticket;

                    long l = entrada.length -1;

                    for (int e = 1; e <= entrada.length ; e++){
                        long x = (long) Math.pow(10, l);
                        entrada[e-1] = ent2/x;
                        e2[e-1] = ent2/x;
                        ent2 = ent2%x;
                        l--;
                    }

                    long sum = 0;
                    long menDer = entrada[0];
                    long mayIzq = 0;
                    for (int p = 0; p < entrada.length; p++){
                        if ((p+1)%2 == 0){
                            for (int p2 = 0; p2 < p; p2++) {
                                if (entrada[p2] > mayIzq) {
                                    mayIzq = entrada[p2];
                                }
                            }
                            e2[p] = e2[p]*2 + mayIzq;
                        } else {
                            menDer = 37;
                            e2[p] = 37;
                            for (int q = p; q < e2.length; q++){
                                if (e2[q] < menDer){
                                    menDer = e2[q];
                                }
                            }
                            e2[p] = entrada[p]*3 + menDer;
                        }
                    }
                    for (long t : e2){
                        sum = sum + t;
                    }
                    System.out.println(sum);
                }
            }
        }
    }

    private static int getDigTick(long ent, int digTick) {
        while (ent > 0){
            ent = ent /10;
            digTick++;
        }
        return digTick;
    }

    private static long getTicket(Scanner sc) {
        long ticket = sc.nextLong();
        sc.nextLine();
        return ticket;
    }
}
