package CodeForces;

import java.util.Scanner;

public class Photos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cnt = 0;
        String [][] arr = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.next();
                if (arr[i][j].equals("C") || arr[i][j].equals("M") || arr[i][j].equals("Y")){
                    cnt++;
                }
            }
        }
        if (cnt == 0){
            System.out.println("#Black&White");
        } else {
            System.out.println("#Color");
        }
    }
}
