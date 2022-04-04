package CodeForces;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, s;
        n = scanner.nextInt();
        s = scanner.nextInt();
        if (s % n == 0){
            System.out.println(s/n);
        } else {
            System.out.println(s/n + 1);
        }
    }
}
