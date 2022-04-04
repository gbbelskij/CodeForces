package CodeForces;

import java.util.Scanner;

public class Trikangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        if(n % 3 == 0 || n== 1){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
