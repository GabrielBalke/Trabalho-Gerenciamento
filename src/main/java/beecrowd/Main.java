package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        double soma = 0; 
        double n = 0;
        while (n >= 0) {
            n = in.nextInt();
            if (n >= 0) { 
                cont++;
                soma+=n;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }

}