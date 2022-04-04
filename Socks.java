package CodeForces;

import java.util.Scanner;

public class Socks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, f;
        n = scanner.nextInt();
        m = scanner.nextInt();
        f = n + n / m;
        if(f - n < m){
            System.out.println(f);
        } else {
            System.out.println(f + (f - n) / m);
        }
    }
}
