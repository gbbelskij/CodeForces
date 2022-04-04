package CodeForces;

import java.util.Scanner;

public class hq9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int a = 0;
        s = scanner.next();
        for (int i = 0; i < s. length(); i++) {
            if (s.charAt(i) == 72 || s.charAt(i) == 81 || s.charAt(i) == 57){
                a++;
            }
        }
        if (a > 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
