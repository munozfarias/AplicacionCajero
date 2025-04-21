package clases;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Cajero {
    public static String retirarDinero (double cantidad){
        if (cantidad > 8000){
            return "Estás tratando de retirar mucho dinero, el límite es $8000";
        }
        return "Retiraste exitosamente la cantidad de $" + cantidad;    
    }

    public static String pagarFactura(double totalFactura, double cantidadPagada) {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");

        if (cantidadPagada < totalFactura) {
            double restante = totalFactura - cantidadPagada;
            return "El día de " + formato.format(fecha) + " pagaste $" + cantidadPagada +
                   ", aún te hacen falta $" + restante;
        }else if (cantidadPagada == totalFactura) {
            return "Gracias por tu pago completo el día de " + formato.format(fecha);
        }
        else {double cambio = cantidadPagada - totalFactura;
            return "Gracias por tu pago el día de " + formato.format(fecha) +
                   ", tu cambio es de $" + cambio;}
        }
    public static boolean cambiarBilletes (int cantidad,  int denominacion){
        return cantidad % denominacion == 0;
    }

    public static String totalDeBilletesYMonedas (int cantidad){
        int [] billetes = {500, 200, 100, 50, 20};
        int [] monedas = {10, 5, 2, 1};
        StringBuilder resultado = new StringBuilder();

        for (int b : billetes) {
            int count = cantidad / b;
            if (count > 0){
                resultado.append(count).append(" billetes de ").append(b).append(", ");
                cantidad %= b; 
            }
        }
        for (int m : monedas) {
            int count = cantidad / m;
            if (count > 0) {
                resultado.append(count).append(" monedas de ").append(m).append(", ");
                cantidad %= m;
            }
        }
        return resultado.toString();
    }
}
