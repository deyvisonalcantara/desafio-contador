import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        try {
            // Receber os parâmetros via terminal
            System.out.print("Digite o primeiro número: ");
            int parametroUm = scanner.nextInt();
            
            System.out.print("Digite o segundo número: ");
            int parametroDois = scanner.nextInt();

            // Validar os parâmetros e lançar exceção se necessário
            if (parametroUm > parametroDois) {
                throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Calcular a quantidade de interações e imprimir os números
            for (int i = 1; i <= (parametroDois - parametroUm); i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

    

