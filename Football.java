package CodeForces;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int a = 0, max = 0;
        s = scanner.next();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                a++;
                if (a > max) {
                    max = a;
                }
            } else {
                a = 0;
            }
        }
        if (max + 1 >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
