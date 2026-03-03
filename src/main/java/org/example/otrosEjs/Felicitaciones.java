package org.example.otrosEjs;

import java.util.Scanner;

public class Felicitaciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            int tMax = scanner.nextInt();
            scanner.nextLine();

            if (tMax >= 1 && tMax <= 100000){
                int vec = 0;
                int res = scanner.nextInt();

                do {
                    int uRes = tMax + res;
                    vec++;
                    while (res <= uRes) {
                        res = scanner.nextInt();
                        if (res == 0 || res > (int) (Math.pow(10, 9))) {
                            break;
                        }
                    }
                } while (res != 0 && res <= (int) (Math.pow(10, 9)));
                scanner.nextLine();
                System.out.print(vec);
            } else {
                System.out.print("Error");
            }
        }
    }
}
