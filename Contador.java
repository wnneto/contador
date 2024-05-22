import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numA = input.nextInt();

        System.out.println("Digite outro número: ");
        int numB = input.nextInt();
        
        // Loop para imprimir os números de numA a numB, pulando o número 3
        for (int numero = numA; numero <= numB; numero++) {
            if (numero == 3) {
                // Quando chegar no número 3, ele não vai imprimir
                continue;
            }
            System.out.println(numero);
        }    

        // Loop para imprimir os números de numA a numB, parando no número 6
        for (int numero2 = numA; numero2 <= numB; numero2++) {
            if (numero2 == 6) {
                // Quando chegar no número 6, ele vai parar
                break;
            }
            System.out.println(numero2);
        }    
        
        try {
            // Chamando a lógica de contagem
            contar(numA, numB);
        } catch (ErroException e) {
            
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int numA, int numB) throws ErroException {
        // Validar se numA é maior que numB e lançar a exceção
        if (numA > numB) {
            throw new ErroException();
        }
        // Realizar a contagem
        for (int i = numA; i <= numB; i++) {
            System.out.println(i);
        }
    }
}

// Definição da exceção personalizada
class ErroException extends Exception {
    public ErroException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}
