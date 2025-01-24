package com.JuanPablo.conversorMoneda.clases;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Busqueda {

    public void realizarBusqueda(String moneda1, String moneda2, int cantidad) {

        try {
            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/45ca9dc51b77449d1577ea1d/pair/" + moneda1 +
                    "/" + moneda2 + "/" + cantidad);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();

            double conversionRate = jsonResponse.get("conversion_rate").getAsDouble();

            double resultado = cantidad * conversionRate;

            System.out.println("Resultado de la conversion: " + resultado + " " + moneda2);



        } catch (Exception e) {
            System.out.println("Error al realizar la busqueda: " + e.getMessage());
        }
    }
}

















// https://v6.exchangerate-api.com/v6/45ca9dc51b77449d1577ea1d/latest/USD