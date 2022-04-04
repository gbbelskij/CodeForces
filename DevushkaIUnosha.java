package CodeForces;

import java.util.Scanner;

public class DevushkaIUnosha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int cnt = 0, cnt1 = 0;
        s = scanner.next();
        cnt1 = s.length();
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)){
                    cnt++;
                }
                if (cnt != 0){
                    cnt1 = cnt1 - 1;
                }
            }
        }
        if (cnt1 % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
