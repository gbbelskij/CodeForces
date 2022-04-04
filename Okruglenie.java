package CodeForces;

import java.util.Scanner;

public class Okruglenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if ((n % 10) == 0){
            System.out.println(n);
        } else {
            if (n % 10 <= 5){
                System.out.println(n - n % 10);
            } else {
                System.out.println(n + (10 - n % 10));
            }
        }
    }
}
