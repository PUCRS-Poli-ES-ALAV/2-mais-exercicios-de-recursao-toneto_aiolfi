public class Ex4
 {

    public static int somatorio(int k, int j) {

        if (k == j) {
            return k;
        }

        return k + somatorio(k + 1, j);
    }

    public static void main(String[] args) {

        int k = 3;
        int j = 7;

        int resultado = somatorio(k, j);

        System.out.println("somatorio entre " + k + " e " + j + " = " + resultado);
    }
}