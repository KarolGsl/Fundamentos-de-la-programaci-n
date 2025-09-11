import java.util.Scanner;

public class Cine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Ingresa el dia de la semana (1=Lunes ... 7=Domingo): ");
            int dia = sc.nextInt();
            System.out.print("Cuantas personas van al cine: ");
            int personas = sc.nextInt();
            System.out.print("¿Tienes membresia? (s/n): ");
            char membresia = sc.next().charAt(0);

            int precio = 50;
            int total = 0;

            switch (dia) {
                case 3: // Miércoles
                    total = personas * 30;
                    break;
                case 4: // Jueves
                    if (personas % 2 == 0) {
                        total = (personas / 2) * 75;
                    } else {
                        total = (personas / 2) * 75 + 50;
                    }
                    break;
                default:
                    total = personas * precio;
                    break;
            }

            if (membresia == 's') {
                total = (int)(total * 0.9); // 10% descuento
            }

            System.out.println("El precio total es: $" + total);

            System.out.print("¿Quieres calcular otro grupo? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');
    }
}
