import com.JuanPablo.conversorMoneda.clases.Busqueda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la moneda que quiere convertir: ");
        String moneda1 = lectura.nextLine();

        System.out.println("*******************************************");

        System.out.println("USD.");

        System.out.println("*******************************************");

        System.out.println("Ingrese la moneda a la cual quiere convertir: ");
        String moneda2 = lectura.nextLine();

        System.out.println("*******************************************");

        System.out.println("EUR");

        System.out.println("*******************************************");

        System.out.println("Ingrese la cantidad de la moneda: ");
        int cantidad = lectura.nextInt();

        Busqueda busqueda = new Busqueda();
        busqueda.realizarBusqueda(moneda1, moneda2, cantidad);

        lectura.close();
    }
}