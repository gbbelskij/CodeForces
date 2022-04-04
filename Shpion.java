package CodeForces;

import java.util.ArrayList;
import java.util.Scanner;

public class Shpion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t, s;
        Integer cnt1, cnt2, cnt3;
        t = scanner.nextInt();
        for (int j = 0; j < t; j++) {
            s = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int k = 0; k < s; k++) {
                list.add(scanner.nextInt());
            }


            cnt1 = list.get(0);
            cnt2 = list.get(1);
            cnt3 = list.get(2);
        if (cnt1 == cnt2 && cnt2 == cnt3 && cnt1 == cnt3){
            for (Integer i = 0; i < list.size(); i++) {
                if (list.get(i) != cnt1){
                    System.out.println(i + 1);
                    break;
                }
            }
        } else if (cnt1 != cnt2 && cnt2 != cnt3){
            System.out.println(2);
        } else if (cnt1 != cnt2 && cnt1 != cnt3){
            System.out.println(1);
        } else if (cnt3 != cnt1 && cnt3 != cnt2){
            System.out.println(3);
        }

    }
}
}
