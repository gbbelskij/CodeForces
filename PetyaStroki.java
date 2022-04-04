package CodeForces;

import java.util.Locale;
import java.util.Scanner;

public class PetyaStroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.next();
        s2 = scanner.next();
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) > s2.charAt(i)){
                System.out.println(1);
                break;
            } else if (s2.charAt(i) > s1.charAt(i)){
                System.out.println(-1);
                break;
            } else if (i == s1.length() - 1){
                System.out.println(0);
            }
        }
    }
}
