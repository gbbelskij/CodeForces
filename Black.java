package CodeForces;

import java.util.Scanner;

public class Black {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d, cnt = 0;
        String s;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt = cnt + a;
            } else if (s.charAt(i) == '2') {
                cnt = cnt + b;
            } else if (s.charAt(i) == '3') {
                cnt = cnt + c;
            } else if (s.charAt(i) == '4') {
                cnt = cnt + d;
            }
        }
        System.out.println(cnt);
    }
}
