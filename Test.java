package CodeForces;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, hp1 = 1000, hp2 = 2000, hit1 = 300, hit2 = 500, hp3 = 3000, sta = 100, hit = 0;
        System.out.println("Вы встретили первого босса!");
        while (hp1 > 0) {
            System.out.print("Нажмите 1, если хотите провести 1-й удар, нажмите 2, если хотите провести 2 удар --> ");
            a = scanner.nextInt();
            if (a == 1) {
                hit = 300;
                sta -= 20;
            } else if (a == 2) {
                hit = 500;
                sta -= 30;
            }

            hp1 = hp1 - hit;
            if (hp1 > 0) {
                System.out.println("Выносливость сейчас = " + sta);
            } else {
                sta = 100;
                System.out.println("Выносливость сейчас = " + sta);
            }
        }
        System.out.println("Вы встретили второго босса!");
        while (hp2 > 0) {
            System.out.print("Нажмите 1, если хотите провести 1-й удар, нажмите 2, если хотите провести 2 удар --> ");
            a = scanner.nextInt();
            if (a == 1) {
                hit = 300;
                sta -= 20;
            } else if (a == 2) {
                hit = 500;
                sta -= 30;
            }

            hp2 = hp2 - hit;
            if (hp2 > 0) {
                System.out.println("Выносливость сейчас = " + sta);
            } else {
                sta = 100;
                System.out.println("Выносливость сейчас = " + sta);
            }
        }


    }}










