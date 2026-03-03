package org.example.otrosEjs;

import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();

        for (int c = 0; c < casos; c++){
            int number = sc.nextInt();
            sc.nextLine();

            if (number/11 == 1){
                System.out.print("8");
            } else if (number == 6174){
                System.out.print("0");
            } else if (number < 1000){
                int vec = 0;
                while (number != 6174){
                    vec++;
                    number = kaprekar(number);
                }
                System.out.println(vec);
            }
        }
    }

    private static int kaprekar(int number){
        int dig = contDigits(number);
        int[] num = new int[4];

        int start = 4 - dig;
        for (int i = 0; i < start; i++){
            num[i] = 0;
        }

        for (int i = start; i < 4; i++){
            num[i] = number % 10;
            number = number/10;
        }
        int max = 0;
        int min = 9;

        int[] ordMay = new int[4];
        int[] ordMen = new int[4];

        for (int i : num){
            if (i > max){
                max = i;
            } if (i < min){

                min = i;
            } else{
                ordMay[1] = i;
                ordMen[1] = i;
            }
        }
        ordMen[3] = max;
        ordMay[0] = max;
        ordMay[3] = min;
        ordMen[0] = min;

        //n[1] < m[0] -> n[1] > men[3] -> n[1] > n[2] -> n[1] = may[1] && men[2] -/-> n[1] = may[2] && men[1]
        int p = 0;
        for(int n : num){
            if (n < max){
                if (n > min){
                   // if (num[1])
                }
            }
        }

        int pow = 3;

        int[] res = new int[4];
        int kap = 0;

        for (int i = 0; i < 4; i++) {
            res[i] = ordMay[i] - ordMen[i];
        }

        for (int n : res){
            kap += (int) ( n * Math.pow(10, pow));
            pow--;
        }
        return kap;
    }

    private static int contDigits(int number){
        int cont = 0;
        while (number > 0){
            number = number/10;
            cont++;
        }
        return cont;
    }
}
