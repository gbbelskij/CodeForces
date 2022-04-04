package CodeForces;

import java.util.Scanner;

public class Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String s;
            char b;
            int cnt = 0;
            s = scanner.next();
            for (int j = 0; i < s.length(); i++) {
                b = s.charAt(i);
                if (s.charAt(i) == b) {
                    System.out.println(2);
                }
            }
        }
    }
}
