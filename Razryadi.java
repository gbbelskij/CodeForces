package CodeForces;

import java.util.Scanner;

public class Razryadi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            System.out.println((n % 1000 * 1000)+(n % 100 * 100)+(n % 10 * 10));
        }
    }
}
