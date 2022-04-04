package CodeForces;

import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), cnt = 0, lmin = 1000000000, lmax = 0, a;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            if (a < lmin){
                lmin = a;
                cnt++;
            }
            if (a > lmax){
                lmax = a;
                cnt++;
            }
        }
        System.out.println(cnt - 1 - 1);
    }
}
