package CodeForces;

import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int cnt = 0, n;
        n = scanner.nextInt();
        s = scanner.next();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i + 1) == s.charAt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
