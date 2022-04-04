package CodeForces;

import java.util.Scanner;

public class Proezd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt();
        int cnt1 , cnt2;
        cnt1 = n * a;
        if (n % m == 0) {
            cnt2 = n / m * b;
        } else {
            cnt2 = (n / m) * b + (n - n/m) * a ;
        }
        if (cnt1 <= cnt2){
            System.out.println(cnt1);
        } else {
            System.out.println(cnt2);
        }
    }
}
