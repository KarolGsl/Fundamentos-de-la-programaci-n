import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        
        System.out.print("Ingrese la cantidad de estudiantes: ");
        n = sc.nextInt();

        System.out.print("Ingrese la cantidad de examenes: ");
        m = sc.nextInt();

        double[][] calificaciones = new double[n][m];
        double[] promedios = new double[n];

        System.out.println("\n--- Ingreso de calificaciones ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante #" + (i + 1));
            for (int j = 0; j < m; j++) {
                System.out.print("  Calificacion del examen " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < m; j++) {
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / m;
        }

        System.out.println("\nPromedios de cada estudiante: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + " -> Promedio: " + promedios[i]);
        }

        System.out.println("\nEstudiantes con promedio entre 9 y 10: ");
        boolean hayAltos = false;
        for (int i = 0; i < n; i++) {
            if (promedios[i] >= 9 && promedios[i] <= 10) {
                hayAltos = true;
                System.out.println("Estudiante " + (i + 1) + " -> Promedio: " + promedios[i]);
            }
        }
        if (!hayAltos) System.out.println("Ningun estudiante con promedio entre 9 y 10");

        System.out.println("\nEstudiantes con promedio inferior a 7:");
        boolean hayBajos = false;
        for (int i = 0; i < n; i++) {
            if (promedios[i] < 7) {
                hayBajos = true;
                System.out.println("Estudiante " + (i + 1) + " -> Promedio: " + promedios[i]);
            }
        }
        if (!hayBajos) System.out.println("Ningun estudiante con promedio inferior a 7");

        double[] promedioExamen = new double[m];
        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma += calificaciones[i][j];
            }
            promedioExamen[j] = suma / n;
        }

        System.out.println("\nPromedios por examen: ");
        for (int j = 0; j < m; j++) {
            System.out.println("Examen " + (j + 1) + " -> Promedio: " + promedioExamen[j]);
        }

        double mayorProm = promedioExamen[0];
        double menorProm = promedioExamen[0];
        int examenMayor = 0, examenMenor = 0;

        for (int j = 1; j < m; j++) {
            if (promedioExamen[j] > mayorProm) {
                mayorProm = promedioExamen[j];
                examenMayor = j;
            }
            if (promedioExamen[j] < menorProm) {
                menorProm = promedioExamen[j];
                examenMenor = j;
            }
        }

        System.out.println("Examen con promedio mas alto: " + (examenMayor + 1) + " -> " + mayorProm);
        System.out.println("Examen con promedio mas bajo: " + (examenMenor + 1) + " -> " + menorProm);

        sc.close();



        System.out.println("Tenkiu por usar el programa profaaaaaaaaaaaaaaaaaaa saludoooooooosssssss");
    }


}
