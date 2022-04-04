package CodeForces;

import java.util.Scanner;

public class Cubic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d = 6;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a >= b) {
            c = 6 - a + 1;
            if (c == 3) {
                System.out.println(1 + "/" + d / 3);
            } else if (c == 2 || c == 4) {
                System.out.println(c / 2 + "/" + d / 2);
            } else if (c == 1) {
                System.out.println(c + "/" + d);
            } else if (c == 5) {
                System.out.println("5/6");
            } else {
                System.out.println(c / 6 + "/" + d / 6);
            }
        } else {
            c = 6 - b + 1;
            if (c == 3) {
                System.out.println(1 + "/" + d / 3);
            } else if (c == 2 || c == 4) {
                System.out.println(c / 2 + "/" + d / 2);
            } else if (c == 1) {
                System.out.println(c + "/" + d);
            } else if (c == 5) {
                System.out.println("5/6");
            } else {
                System.out.println(c / 6 + "/" + d / 6);
            }
        }
    }
}
