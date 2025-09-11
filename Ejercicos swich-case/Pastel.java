import java.util.Scanner;

public class Pastel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.println("Elige el sabor del pastel:");
            System.out.println("1. Manzana");
            System.out.println("2. Fresa");
            System.out.println("3. Chocolate");
            int opcion = sc.nextInt();

            int precio = 0; // inicializar para evitar errores

            switch (opcion) {
                case 1:
                    precio = 200;
                    break;
                case 2:
                    precio = 250;
                    break;
                case 3:
                    System.out.println("1. Chocolate negro");
                    System.out.println("2. Chocolate blanco");
                    int tipo = sc.nextInt();
                    switch (tipo) {
                        case 1: precio = 280; break;
                        case 2: precio = 300; break;
                        default: 
                            System.out.println("Tipo no valido");
                            precio = 0;
                            break;
                    }
                    break;
                default:
                    System.out.println("Sabor no valido");
                    precio = 0;
                    break;
            }

            if (precio > 0) { // solo sigue si el precio es válido
                System.out.print("¿Cuantos snacks deseas agregar? (cada uno $25): ");
                int snacks = sc.nextInt();
                precio += snacks * 25;

                System.out.print("¿Quieres personalizar con nombre? (s/n): ");
                char nombre = sc.next().charAt(0);
                if (nombre == 's') {
                    precio += 30;
                }

                System.out.println("El precio total del pastel es: $" + precio);
            }

            System.out.print("¿Quieres hacer otro pedido? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');
    }
}
