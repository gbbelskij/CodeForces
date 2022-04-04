package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, cnt = 0, cnt1 = 0;
        Integer tmp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
            if (arr.get(i) == 0){
                cnt1++;
            }
            if (i == k - 1){
               tmp = arr.get(i);
            }
        }
        for(Integer i : arr){
            if (cnt1 == n){
                cnt1 = 0;
            } else
            if (i >= tmp){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
