package CodeForces;

import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 1, n;
        String s = "";
        char cnt1 = ' ';
        String a;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a = scanner.next();
            if (a.charAt(0) == cnt1){
                cnt++;
            }
            cnt1 = a.charAt(1);

        }
        System.out.println(cnt);
    }
}
