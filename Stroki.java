package CodeForces;

import java.util.Scanner;

public class Stroki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s, a = "";
        s = scanner.next();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'o' || s.charAt(i) == 'y' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'i'){

            } else {
                a = a + "." + s.charAt(i);
            }
        }
        System.out.println(a);
    }
}
