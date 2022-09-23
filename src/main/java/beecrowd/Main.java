package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] numeros = {2, 6, -2};
        inicio(numeros);
    }

    public static double inicio(int[] numeros) {
        // Scanner in = new Scanner(System.in);
        int cont = 0;
        double soma = 0; 
        double n = 0;
        while (n >= 0) {
            n = numeros[cont];
            cont++;
            soma+=n;
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
        return media;
    }

}