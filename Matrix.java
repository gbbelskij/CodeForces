package CodeForces;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr = new int[5][5];
        int a = 0, b = 0, cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] != 0){
                    a = i;
                    b = j;
                }
            }
        }
        if (a >= 2){
            cnt = a - 2;
        } else {
            cnt = 2 - a;
        }
        if (b >= 2){
            cnt = cnt + b - 2;
        } else {
            cnt = cnt + 2 - b;
        }
        System.out.println(cnt);
    }
}
