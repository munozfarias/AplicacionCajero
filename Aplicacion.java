import clases.Cajero;
import java.util.Scanner;

public class Aplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Cajero ---");
            System.out.println("1. Retirar dinero");
            System.out.println("2. Pagar factura");
            System.out.println("3. Cambiar billetes");
            System.out.println("4. Calcular billetes y monedas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad a retirar: ");
                    double cantidad = scanner.nextDouble();
                    System.out.println(Cajero.retirarDinero(cantidad));
                    break;

                case 2:
                    System.out.print("Ingresa el total de la factura: ");
                    double totalFactura = scanner.nextDouble();
                    System.out.print("Ingresa la cantidad pagada: ");
                    double cantidadPagada = scanner.nextDouble();
                    System.out.println(Cajero.pagarFactura(totalFactura, cantidadPagada));
                    break;

                case 3:
                    System.out.print("Ingresa la cantidad total a cambiar: ");
                    int cantidadCambio = scanner.nextInt();
                    System.out.print("Ingresa la denominación deseada: ");
                    int denominacion = scanner.nextInt();
                    boolean sePuedeCambiar = Cajero.cambiarBilletes(cantidadCambio, denominacion);
                    System.out.println("¿Es posible el cambio? " + sePuedeCambiar);
                    break;

                case 4:
                    System.out.print("Ingresa una cantidad para desglosar en billetes y monedas: ");
                    int cantidadBilletes = scanner.nextInt();
                    System.out.println(Cajero.totalDeBilletesYMonedas(cantidadBilletes));
                    break;

                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
