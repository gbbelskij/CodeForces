package CodeForces;

import java.util.Scanner;

public class Physucs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, y, z, cnt = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            cnt = cnt + x + y + z;
        }
        if (cnt == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
