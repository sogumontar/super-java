package banksoal.URI;

import java.util.Scanner;

/**
 * @author Sogumontar Hendra Simangunsong
 * @version : URI_1182, v 0.1 2/24/22 2:46 PM Sogumontar Hendra Exp $$
 */
public class URI_1182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        char t = sc.next().charAt(0);

        double m[][] = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        switch (t) {

            case 'S':
                double soma = 0;
                for (int i = 0; i < m.length; i++) {
                    soma += m[i][l];
                }
                System.out.printf("%.1f", soma);
                break;
            case 'M':
                double media = 0;
                for (int i = 0; i < m.length; i++) {
                    media += m[i][l];
                }
                media /= m.length;
                System.out.printf("%.1f", media);
                break;
        }
        System.out.println();
    }
}
