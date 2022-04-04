package CodeForces;

import java.util.Scanner;

public class CircledNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            n = scanner.nextInt();
            System.out.print(n / 100000 * 100000 + ' ');
            n = n - n / 100000 * 100000;
            System.out.print(n/ 10000 * 10000 +' ');
            n = n - n/ 10000 * 10000;
            System.out.print(n/1000 * 1000+' ');
            n = n - n/1000 * 1000;
            System.out.print(n/100*100 + ' ');
            n = n - n/100*100;
            System.out.print(n / 10*10+ ' ');
            n = n - n/10*10;
            System.out.println(n);
        }
    }
}
