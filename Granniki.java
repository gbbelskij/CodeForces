package CodeForces;

import java.util.Scanner;

public class Granniki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int n, cnt = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            s = scanner.next();
            if (s.equals("Tetrahedron")){
                cnt = cnt + 4;
            } else if (s.equals("Cube")){
                cnt = cnt + 6;
            } else if (s.equals("Octahedron")){
                cnt = cnt + 8;
            } else if (s.equals("Dodecahedron")){
                cnt = cnt + 12;
            } else if (s.equals("Icosahedron")){
                cnt = cnt + 20;
            }
        }
        System.out.println(cnt);
    }
}
