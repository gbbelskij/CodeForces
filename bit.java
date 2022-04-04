package CodeForces;

import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x = 0;
        String s;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '-' && s.charAt(j + 1) == '-'){
                    x--;
                    j++;
                } else if (s.charAt(j) == '+' && s.charAt(j + 1) == '+'){
                    ++x;
                    j++;
                }
            }
        }
        System.out.println(x);
    }
}
