package CodeForces;

import java.util.Scanner;

public class DedMoroz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        int x, y, n;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            n = scanner.nextInt();
            for (int j = n; j > 0; j--) {
                if (j % x == y){
                    System.out.println(j);
                    break;
                } else if (j == 1){
                    System.out.println(0);
                    break;
                }
            }
        }
    }
}
