import java.util.Scanner;

public class probabilities {
    Scanner sc = new Scanner(System.in);
    public double x = Double.parseDouble(sc.nextLine());
    public double y = Double.parseDouble(sc.nextLine());
    public double a = 0.0;
    public double factorial(double fact){ // factorial calculation of number
        a = 1;
        for (int i = 1; i <= fact; i++) {
            a = a * i;
        }
        return a;
    }

    public static void main(String[] args) {
        probabilities func = new probabilities();

        double chis = 0.0;
        double znam = 0.0;
        double a_2 = 0.0;

        chis = Math.pow(func.y, func.x) / func.factorial(func.x);

        for (int k = 0; k <= func.x; k++) {
            a_2 = Math.pow(func.y, k) / func.factorial(k);
            znam += a_2;
        }
        double Exy = chis / znam;

        System.out.printf("--------------------\n" +
                          "chislitel = %.4f\n" +
                          "znamenatel = %4f\n\n" +
                          "[chislitel/znamenatel] ===> E%.0f(%.0f) = %s", chis, znam, func.x, func.y, Exy);
    }
}
/*
    5
    11

chislitel = 1342,0917
znamenatel = 2246,466667

[chislitel/znamenatel] ===> E5(11) = 0.5974233611300709
 */
