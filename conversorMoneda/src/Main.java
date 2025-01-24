import com.JuanPablo.conversorMoneda.clases.Busqueda;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] monedas = {"USD", "EUR", "JPY", "COP", "ARS", "MXN", "CLP", "BRL"};

        int bucle = 0;
        int bucle2 = 0;
        String moneda1 = "";
        String moneda2 = "";


        Scanner lectura = new Scanner(System.in);


        while (bucle == 0) {

            System.out.println("Ingrese las siglas de la moneda que quiere convertir las cuales se muestran a continuacion ");


            System.out.println("*******************************************");

            System.out.println("Dolar (USD). Euro (EUR). Yen Japones (JPY). Peso Colombiano (COP). " +
                    "Peso Argentino (ARS). Peso Mexicano (MXN) Peso Chileno (CLP). Real Brasileño (BRL).");

            System.out.println("*******************************************");

            moneda1 = lectura.nextLine().toUpperCase();

            if (Arrays.asList(monedas).contains(moneda1)) {
                bucle = 1;
            }

        }


        while (bucle2 == 0) {

            System.out.println("Ingrese las siglas de la moneda la cual quiere convertir y las cuales se mostraran a continuacion ");


            System.out.println("*******************************************");

            System.out.println("Dolar (USD). Euro (EUR). Yen Japones (JPY). Peso Colombiano (COP). " +
                    "Peso Argentino (ARS). Peso Mexicano (MXN) Peso Chileno (CLP). Real Brasileño (BRL).");

            System.out.println("*******************************************");

            moneda2 = lectura.nextLine().toUpperCase();

            if (Arrays.asList(monedas).contains(moneda2)) {
                bucle2 = 1;
            }
        }


        System.out.println("Ingrese la cantidad de " + moneda1 + ": ");
        int cantidad = lectura.nextInt();

        Busqueda busqueda = new Busqueda();
        busqueda.realizarBusqueda(moneda1, moneda2, cantidad);

        lectura.close();
    }
}