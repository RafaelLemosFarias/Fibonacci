import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciCalculator {
    public static List<Integer> calcularFibonacci(int n) {
        List<Integer> fibonacci = new ArrayList<>();

        if (n <= 0) {
            return fibonacci;
        } else if (n == 1) {
            fibonacci.add(0);
            return fibonacci;
        } else if (n == 2) {
            fibonacci.add(0);
            fibonacci.add(1);
            return fibonacci;
        }

        fibonacci.add(0);
        fibonacci.add(1);

        for (int i = 2; i < n; i++) {
            int next = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(next);
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número para calcular a sequência de Fibonacci: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Por favor, insira um número válido.");
            } else {
                List<Integer> resultado = calcularFibonacci(numero);
                System.out.print("A sequência de Fibonacci até o " + numero + "º termo é: ");
                for (int termo : resultado) {
                    System.out.print(termo + " ");
                }
            }
        } else {
            System.out.println("Por favor, insira um número válido.");
        }

        scanner.close();
    }
}
