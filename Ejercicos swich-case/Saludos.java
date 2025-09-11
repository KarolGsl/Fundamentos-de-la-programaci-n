import java.util.Scanner;

public class Saludos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char repetir;

        do {
            System.out.print("Ingresa la hora (0-23): ");
            int hora = sc.nextInt();

            switch (hora) {
                case 6: case 7: case 8: case 9: case 10: case 11: case 12:
                    System.out.println("Buenos dias");
                    break;
                case 13: case 14: case 15: case 16: case 17: case 18: case 19: case 20:
                    System.out.println("Buenas tardes");
                    break;
                case 21: case 22: case 23: case 0: case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Buenas noches");
                    break;
                default:
                    System.out.println("Hora no valida");
                    break;
            }

            System.out.print("¿Quieres ingresar otra hora? (s/n): ");
            repetir = sc.next().charAt(0);

        } while (repetir == 's');
    }
}
