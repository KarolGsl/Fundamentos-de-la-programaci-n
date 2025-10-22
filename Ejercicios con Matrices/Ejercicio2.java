import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean llena = false;
        
        int opcion;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Llenar matriz");
            System.out.println("2. Suma filas y columnas");
            System.out.println("3. Suma de fila");
            System.out.println("4. Suma de columna");
            System.out.println("5. Mayor y menor");
            System.out.println("6. Contar pares");
            System.out.println("7. Contar impares");
            System.out.println("8. Matriz al cuadrado");
            System.out.println("9. Suma diagonal principal");
            System.out.println("10. Suma diagonal inversa");
            System.out.println("11. Media de todos");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Set<Integer> usados = new HashSet<>();
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            int num;
                            do {
                                System.out.print("Valor [" + i + "][" + j + "]: ");
                                num = sc.nextInt();
                                if (usados.contains(num)) System.out.println("Ya existe ese numero");
                            } while (usados.contains(num));
                            matriz[i][j] = num;
                            usados.add(num);
                        }
                    }
                    llena = true;
                    break;

                case 2:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    for (int i = 0; i < 4; i++) {
                        int suma = 0;
                        for (int j = 0; j < 4; j++) suma += matriz[i][j];
                        System.out.println("Fila " + (i + 1) + ": " + suma);
                    }
                    for (int j = 0; j < 4; j++) {
                        int suma = 0;
                        for (int i = 0; i < 4; i++) suma += matriz[i][j];
                        System.out.println("Columna " + (j + 1) + ": " + suma);
                    }
                    break;

                case 3:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    System.out.print("Fila (1-4): ");
                    int f = sc.nextInt() - 1;
                    if (f < 0 || f >= 4) break;
                    int sumaF = 0;
                    for (int j = 0; j < 4; j++) sumaF += matriz[f][j];
                    System.out.println("Suma fila " + (f + 1) + ": " + sumaF);
                    break;

                case 4:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    System.out.print("Columna (1-4): ");
                    int c = sc.nextInt() - 1;
                    if (c < 0 || c >= 4) break;
                    int sumaC = 0;
                    for (int i = 0; i < 4; i++) sumaC += matriz[i][c];
                    System.out.println("Suma columna " + (c + 1) + ": " + sumaC);
                    break;

                case 5:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int mayor = matriz[0][0], menor = matriz[0][0];
                    int mi = 0, mj = 0, ni = 0, nj = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (matriz[i][j] > mayor) { mayor = matriz[i][j]; mi = i; mj = j; }
                            if (matriz[i][j] < menor) { menor = matriz[i][j]; ni = i; nj = j; }
                        }
                    }
                    System.out.println("Mayor: " + mayor + " en [" + mi + "][" + mj + "]");
                    System.out.println("Menor: " + menor + " en [" + ni + "][" + nj + "]");
                    break;

                case 6:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int pares = 0;
                    for (int[] fila : matriz)
                        for (int num : fila)
                            if (num % 2 == 0) pares++;
                    System.out.println("Pares: " + pares);
                    break;

                case 7:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int impares = 0;
                    for (int[] fila : matriz)
                        for (int num : fila)
                            if (num % 2 != 0) impares++;
                    System.out.println("Impares: " + impares);
                    break;

                case 8:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int[][] cuadrada = new int[4][4];
                    for (int i = 0; i < 4; i++)
                        for (int j = 0; j < 4; j++)
                            cuadrada[i][j] = matriz[i][j] * matriz[i][j];
                    for (int[] fila : cuadrada) {
                        for (int num : fila)
                            System.out.print(num + "\t");
                        System.out.println();
                    }
                    break;

                case 9:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int dp = 0;
                    for (int i = 0; i < 4; i++) dp += matriz[i][i];
                    System.out.println("Diagonal principal: " + dp);
                    break;

                case 10:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int di = 0;
                    for (int i = 0; i < 4; i++) di += matriz[i][3 - i];
                    System.out.println("Diagonal inversa: " + di);
                    break;

                case 11:
                    if (!llena) { System.out.println("Primero llena la matriz"); break; }
                    int sumaT = 0;
                    for (int[] fila : matriz)
                        for (int num : fila)
                            sumaT += num;
                    double media = (double) sumaT / 16;
                    System.out.println("Media: " + media);
                    break;

                case 0:
                    System.out.println("Adiosss");
                    break;
            }
        } while (opcion != 0);
    
    System.out.println("Tenkius vale por 10 de calificacion profa :)");
    
    }

}
