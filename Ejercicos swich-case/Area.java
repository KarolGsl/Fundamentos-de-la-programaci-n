import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Menu de Areas:");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Circulo");
            System.out.print("Elige opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Lado: ");
                    int lado = sc.nextInt();
                    System.out.println("Area: " + (lado * lado));
                    break;
                case 2:
                    System.out.print("Base: ");
                    int base = sc.nextInt();
                    System.out.print("Altura: ");
                    int altura = sc.nextInt();
                    System.out.println("Area: " + (base * altura));
                    break;
                case 3:
                    System.out.print("Base: ");
                    int bt = sc.nextInt();
                    System.out.print("Altura: ");
                    int ht = sc.nextInt();
                    System.out.println("Area: " + ((bt * ht) / 2));
                    break;
                case 4:
                    System.out.print("Radio: ");
                    int r = sc.nextInt();
                    System.out.println("Area: " + (3.14 * r * r));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

            System.out.println("¿Quieres calcular otra area? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');
    }
}
