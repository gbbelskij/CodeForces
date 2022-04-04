package CodeForces;

import java.util.Scanner;

public class Zabor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, h, h1, cnt = 0;
        n = scanner.nextInt();
        h = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            h1 = scanner.nextInt();
            if (h1 <= h){
                cnt++;
            } else {
                cnt = cnt + 2;
            }
        }
        System.out.println(cnt);
    }
}
