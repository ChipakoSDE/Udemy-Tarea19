import java.util.Scanner;

public class Silla {
    public static void main(String[] args) {
        int[][] matriz;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz a crear: ");
        int t = s.nextInt();
        if (t == 0) {
            System.err.println("ERROR");
            System.exit(1);
        }
        matriz = new int[t][t];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(j == 0 || i == t/2 || (i > t/2 && j == t-1)) {
                    matriz[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz [i][j]);
            }
            System.out.println();
        }
    }
}
