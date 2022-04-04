package CodeForces;

import java.util.Scanner;

public class Troiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, k, cnt = 0, a = 0;
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            k = scanner.nextInt();
            for (int j = 0; j < k; j++) {
                a = scanner.nextInt();
                cnt+=a;
            }
     //       if ()
            if (cnt % 2 == 0){
                System.out.println("No");
            } else{
                System.out.println("Yes");
            }
        }
    }
}
