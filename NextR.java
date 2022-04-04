package CodeForces;

import java.util.Scanner;

public class NextR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, k, cnt = 0;
        a = scanner.nextInt();
        k = scanner.nextInt();
        int [] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (arr[i] >= arr[k-1] && arr[i] > 0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
