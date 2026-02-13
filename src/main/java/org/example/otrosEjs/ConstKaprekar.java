package org.example.otrosEjs;

import java.util.Scanner;

public class ConstKaprekar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int kaprekar = 0;
            int n = sc.nextInt();

            if (n == 0 || n > 9999 || n < 0){
                break;
            }

            int[] num = new int[4];
            int[] numOrdMay = new int[num.length];
            int[] numOrdMen = new int[num.length];

            int nRep = 0;

            if (n % 11 == 0){
                kaprekar = 6174;
                nRep = 8;
            }

            while (kaprekar != 6174){
                int may = 0;
                int n2 = n;
                int posMay = 0;
                int posMen = 0;

                for(int i = 0; i < 4; i++){
                    num[i] = n2 % (10);
                    numOrdMay[i] = n2 % (10);
                    numOrdMen[i] = n2 % (10);

                    n2 = n2/10;
                    if (num[i] > may){
                        may = num[i];
                        posMay = i;
                    }
                }
                int men = may;
                for(int i = 0; i < num.length; i++){
                    if (num[i] == 0){
                        num[i] = 0;
                    }
                    if(num[i] < men){
                        men = num[i];
                        posMen = i;
                    }
                }
                numOrdMay[0] = numOrdMay[posMay];
                numOrdMay[posMay] = num[0];
                numOrdMen[0] = numOrdMen[posMen];
                numOrdMen[posMen] = num[0];


                for (int i = 0; i < num.length; i++){
                    if (numOrdMay[0] <= numOrdMay[i]) {
                        numOrdMay[0] = numOrdMay[i];
                        for (int j = 1; j < 4; j++) {
                            numOrdMay[j] = num[j-1];
                        }
                    }
                }
                for (int i = 0; i < num.length; i++) {
                    if (numOrdMen[0] >= numOrdMen[i]) {
                        numOrdMen[0] = numOrdMen[i];
                        for (int j = 1; j < 4; j++) {
                            numOrdMen[j] = num[j - 1];
                        }
                    }
                }

                int oMay = 0;
                int oMen = 0;
                for (int i = 0; i < num.length; i++){
                    oMay += numOrdMay[i] * (10 * i);
                    oMen += numOrdMen[i] * (10 * i);
                }

                kaprekar = oMay - oMen;
                n = kaprekar;
                nRep++;
            }
            System.out.println(nRep);
        }
    }
}