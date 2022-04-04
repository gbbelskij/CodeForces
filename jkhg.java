package CodeForces;

import java.util.ArrayList;
import java.util.Random;

public class jkhg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(100);
            list.add(a);
        }
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        list.add(5,15);
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
}
