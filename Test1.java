package CodeForces;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(findTheMaxFilm());

    }


    public static String findTheMaxFilm() {

        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;




        if (max(income1, income2, income3) == income1) {
            return "Титаник";
        } else  if (max(income1, income2, income3) == income2){
            return "Аватар";
        } else if (max(income1, income2, income3) == income3)
            return "Тёмный рыцарь";
        else {
            return "";
        }

    }

    public static int max(int a, int b, int c){
        int max1 = 0;
        if (a > b && a > c) {
            max1 = a;
        } else if (b > a && b > c){
            max1 = b;
        } else if (c > a && c > b){
            max1 = c;
        }
       return max1;
    }

}
