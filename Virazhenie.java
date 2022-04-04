package CodeForces;

import java.util.Scanner;

public class Virazhenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a != 0 && b != 0 && c != 0){
            if (a != 1 && b != 1 && c != 1){
                System.out.println(a*b*c);
            } else {
                if (a == 1 && b >= c){
                    System.out.println((a+c)*b);
                } else if (a == 1 && c >= b){

                }
            }
        }
    }
}
