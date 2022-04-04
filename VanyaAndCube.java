package CodeForces;

import java.util.Scanner;

public class VanyaAndCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, cnt = 0, tmp = 0;
        n = scanner.nextInt();
        for (int i = 1; i < n + 1; i++) {
            cnt = cnt + i;
            if (n >= cnt) {
                n = n - cnt;
                tmp++;
            } else{

                break;
            }
        }System.out.println(tmp);
    }
}
