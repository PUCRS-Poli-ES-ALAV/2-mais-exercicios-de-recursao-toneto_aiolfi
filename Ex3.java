//Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.

import java.util.*;

public class Ex3 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }else if(n<0){
            throw new IllegalArgumentException("n deve ser um número positivo");
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o n-ésimo número da sequência de fibonacci:");
        int n = sc.nextInt();
        System.out.println("O " + n + "º número da sequência de fibonacci é: " + fibonacci(n));

    }
}

