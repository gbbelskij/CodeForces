package CodeForces;

import java.util.ArrayList;
import java.util.Random;

public class kjghbkj {
    public static void main(String[] args) {
        Random random = new Random();
        int tmp1;
        Integer tmp2;
        int [] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = array(arr[i], random);
        }
        System.out.print("Массив: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(List(random));
        }
        System.out.print("Список: ");
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (arr[j] > arr[i]){
                    tmp1 = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp1;
                }
            }
        }
        System.out.print("Отсортированный массив: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Отсортированный список: ");
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (list.get(j) > list.get(i)){
                    tmp2 = list.get(j);
                    list.add(j, list.get(i));
                    list.remove(j + 1);
                    list.add(i, tmp2);
                    list.remove(i + 1);
                }
            }
        }
        for(Integer i: list){
            System.out.print(i+ " ");
        }
    }



    public static int array(int a, Random random){
        a = random.nextInt(500);
        return a;
    }
    public static int List(Random random){
        Integer b;
        b = random.nextInt(500);
        return b;
    }
}
