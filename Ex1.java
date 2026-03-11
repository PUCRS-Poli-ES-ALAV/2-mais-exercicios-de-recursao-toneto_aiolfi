//Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.

import java.util.Scanner;

public class Ex1 {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int n = sc.nextInt();
        System.out.println("O fatorial de " + n + " é: " + fatorial(n));

    }
}


