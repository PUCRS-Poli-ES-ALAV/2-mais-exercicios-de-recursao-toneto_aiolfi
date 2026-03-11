public class Ex2 {

    public static int somatorio(int n) {

        if (n == 0) {
            return 0;
        }

        return n + somatorio(n - 1);
    }

    public static void main(String[] args) {

        int numero = 5;

        int resultado = somatorio(numero);

        System.out.println("Somatório de " + numero + " até 0 = " + resultado);
    }
}