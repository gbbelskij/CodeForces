package CodeForces;

import java.util.Scanner;

public class Sweets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, a = 0, b = 0, s, cnt = 0;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            s = scanner.nextInt();
            if (s > 2){
                if (s % 2 == 0)
                System.out.println(s / 2 - 1);
                else {
                    System.out.println(s / 2);
                }
            }
            else{
                System.out.println(0);
            }
        }
    }
}
