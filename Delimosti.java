package CodeForces;

import java.util.Scanner;

public class Delimosti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, a, b, a1 = 0;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            a1 = a;
            b = scanner.nextInt();
            while (a % b != 0){
                a++;
            }
            System.out.println(a - a1);
        }
    }
}
