package CodeForces;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayForMethod {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int N = ArrLength(scanner);
    int[] arr = new int[N];




    public static void main(String[] Gleb) {




    }

    public static int ArrLength(Scanner scanner) {
        System.out.println("На сколько элементов вы хотите создать массив?");
        return scanner.nextInt();
    }

    public static void ArrInput(Scanner scanner, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

    }

    public static void ArrRandom(Random random, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void ArrOutput(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-й элемент массива: " + arr[i]);
        }
    }

    public static int ArrMax(int[] arr) {
        int m = 0, lm = 0;
        for (int i = 0; i < arr.length; i++) {
            lm = arr[i];
            if (lm > m) {
                m = lm;
            }
        }
        System.out.print("Наибольшее число ");
        return m;
    }

    public static int ArrMin(int[] arr) {
        int m = 100, lm = 0;
        for (int i = 0; i < arr.length; i++) {
            lm = arr[i];
            if (lm < m) {
                m = lm;
            }
        }
        System.out.print("Наименьшее число ");
        return m;
    }

    public static void ArrBubble(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    cnt = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = cnt;
                }
            }
        }
    }

    public static void Start(Random random, int[] arr) {
        ArrRandom(random, arr);
        ArrBubble(arr);
        System.out.println(ArrMax(arr));
        System.out.println(ArrMin(arr));
        ArrOutput(arr);

    }

}
