package CodeForces;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cnt = 0;
        n = scanner.nextInt();
        cnt = n / 100;
        n = n - n / 100 * 100;
        cnt = cnt + n /20;
        n = n - n / 20 * 20;
        cnt = cnt + n / 10;
        n = n - n/10 * 10;
        cnt = cnt + n/5;
        n = n - n / 5 * 5;
        cnt = cnt + n;
        System.out.println(cnt);
    }
}
