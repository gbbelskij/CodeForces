package CodeForces;

import java.util.Scanner;

public class Anton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, cnt = 0, t;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            for (int j = 0; j < 999; j++) {
                if (a % b != 0) {
                a++;
                cnt++;
            }
        }
            System.out.println(cnt);
    }
}
}
