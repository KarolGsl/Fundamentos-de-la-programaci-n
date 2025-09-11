import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Ingresa primer numero: ");
            int a = sc.nextInt();
            System.out.println("Ingresa segundo numero: ");
            int b = sc.nextInt();
            System.out.println("Elige operacion (+ - * /): ");
            char op = sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Resultado: " + (a + b));
                    break;
                case '-':
                    System.out.println("Resultado: " + (a - b));
                    break;
                case '*':
                    System.out.println("Resultado: " + (a * b));
                    break;
                case '/':
                    System.out.println("Resultado: " + (a / b));
                    break;
                default:
                    System.out.println("Operacion no valida");
                    break;
            }

            System.out.println("¿Quieres hacer otra operacion? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');
    }
}
