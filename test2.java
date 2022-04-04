package CodeForces;

public class test2 {


    public static void main(String[] args) {
        System.out.println("Наибольшее из чисел = " + findMax());
    }

    public static int findMax() {
        int a = 10;
        int b = 15;
        if (a > b) {
            System.out.println("а больше b");
            return a;
        } else {
            System.out.println("b больше a");
            return b;
        }
    }




}
