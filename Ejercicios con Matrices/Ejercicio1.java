import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int n = 0, m = 0;
        int[][] ventas = new int[50][50];
        double precio = 0;
        boolean datos = false;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Ingresar datos");
            System.out.println("2 - Zona que mas vendio");
            System.out.println("3 - Vendedor que menos vendio");
            System.out.println("4 - Vendedor que mas vendio");
            System.out.println("5 - Total de ventas");
            System.out.println("0 - Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("Numero de vendedores: ");
                    n = sc.nextInt();
                    System.out.print("Numero de zonas: ");
                    m = sc.nextInt();
                    System.out.print("Precio por computadora: ");
                    precio = sc.nextDouble();

                    for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                            System.out.print("Vendedor "+(i+1)+", Zona "+(j+1)+": ");
                            ventas[i][j] = sc.nextInt();
                        }
                    }
                    datos = true;
                    break;

                case 2:
                    if(!datos){ System.out.println("Primero ingresa los datos"); break; }

                    int zonaMax = 0;
                    int mayor = 0;
                    for(int j=0;j<m;j++){
                        int suma = 0;
                        for(int i=0;i<n;i++){
                            suma += ventas[i][j];
                        }
                        if(suma > mayor){ mayor = suma; zonaMax = j; }
                    }
                    System.out.println("Zona que mas vendio: Zona "+(zonaMax+1)+" con "+mayor+" computadoras");
                    break;

                case 3:
                    if(!datos){ System.out.println("Primero ingresa los datos"); break; }

                    int vendMin = 0;
                    int menor = 0;
                    for(int i=0;i<n;i++){
                        int suma = 0;
                        for(int j=0;j<m;j++){
                            suma += ventas[i][j];
                        }
                        if(i==0 || suma<menor){ menor=suma; vendMin=i; }
                    }
                    System.out.println("Vendedor que menos vendio: Vendedor "+(vendMin+1)+" con "+menor+" computadoras, total: $"+(menor*precio));
                    break;

                case 4:
                    if(!datos){ System.out.println("Primero ingresa los datos"); break; }

                    int vendMax = 0;
                    mayor = 0;
                    for(int i=0;i<n;i++){
                        int suma=0;
                        for(int j=0;j<m;j++){
                            suma+=ventas[i][j];
                        }
                        if(suma>mayor){ mayor=suma; vendMax=i; }
                    }
                    System.out.println("Vendedor que mas vendio: Vendedor "+(vendMax+1)+" con "+mayor+" computadoras, total: $"+(mayor*precio));
                    break;

                case 5:
                    if(!datos){ System.out.println("Primero ingresa los datos"); break; }

                    int total = 0;
                    for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++){
                            total += ventas[i][j];
                        }
                    }
                    System.out.println("Total de computadoras vendidas: "+total+", valor total: $"+(total*precio));
                    break;

                case 0:
                    System.out.println("Saliendo....hasta la vista beibi...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while(opcion != 0);

        sc.close();

        System.out.print("Tenkiu bais");
    }
}
