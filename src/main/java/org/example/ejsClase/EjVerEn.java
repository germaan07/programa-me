package org.example.ejsClase.ej4;

import java.util.Scanner;

public class EjVerEn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int crt = 0;
        while (crt == 0){
            int nCasos = sc.nextInt();
            sc.nextLine();
            long digTick = 0;

            for(int i = 0; i < nCasos; i++){
                long trueTick = 0;
                long ticket = 0;
                while (trueTick == 0){
                    ticket = sc.nextLong();
                    sc.nextLine();

                    long nDigT = ticket;

                    while (nDigT >= 1){
                        digTick ++;
                        nDigT = nDigT/10;
                    }

                    if(digTick%2 == 0){
                        trueTick = 1;
                    }
                }
                long sum = 0;
                long nDig = 0;

                for(long dig = 1; dig < digTick; dig++){
                    long dT = 0;
                    long t = ticket;
                    long u = 0;

                    if (dig%2 == 0){
                        u = digTick - dig;
                        long d = (long) (t/(Math.pow(10, u)));

                        long myIz = 10;
                        long digIzq = (long) (ticket/(Math.pow(10, u)));
                        long x = digIzq;
                        for (long n = 1; n <= digIzq; n++){
                            x = digIzq%10;
                            digIzq = digIzq/10;
                            if(x < myIz){
                                myIz = x;
                            }
                        }
                        sum = sum + d*2 + myIz;
                    } else{
                        u = digTick - dig;
                        long d = (long) (t/(Math.pow(10, u)));

                        long mnDer =0;
                        long digDer= (long) (ticket%(Math.pow(10, u)));
                        long x = digDer;
                        for (long n = 1; n <= digDer; n++){
                            x = digDer/10;
                            digDer = digDer/10;
                            if(x > mnDer){
                                mnDer = x;
                            }
                        }
                        sum = sum + d*3 + mnDer;
                    }
                    t = (long) (t%(Math.pow(10, u)));
                }
                System.out.println(sum);
            }
            crt = 1;
        }
    }
}