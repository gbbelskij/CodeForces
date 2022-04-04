package CodeForces;

import java.util.Scanner;

public class LeftRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l, r, a;
        l = scanner.nextInt();
        r = scanner.nextInt();
        a = scanner.nextInt();
        if (r - l > a){
            System.out.println(((l + a) * 2)/2 * 2);
        } else if (l - r > a){
            System.out.println(((r + a) * 2)/2 * 2);
        } else{
            System.out.println((l + r + a)/2 * 2);
        }
    }
}
