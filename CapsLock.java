package CodeForces;

import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        char p;
        int cnt = 0;
        s = scanner.next();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
                cnt++;
            }
            if (((cnt == s.length() - 1)&& (s.charAt(0) >= 97 && s.charAt(0) <= 122))){
                p = s.charAt(0);

            }
        }
    }
}
