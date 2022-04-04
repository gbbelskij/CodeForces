package CodeForces;

import java.util.Scanner;

public class Ravno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, lmax, max = 0, cnt = 0;
        t = scanner.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
            lmax = arr[i];
            if (lmax > max) {
                max = lmax;
            }
        }
            for (int i = 0; i < t; i++) {
                cnt = cnt + max - arr[i];
            }
        System.out.println(cnt);
        }
    }

