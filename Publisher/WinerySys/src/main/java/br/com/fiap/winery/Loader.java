package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args) {
        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();

        Endpoint.publish("http://localhost:8085/WineStockService", wineStock);
        Endpoint.publish("http://localhost:8086/WineWarningService", wineWarning);

        System.out.println("Serviços publicados!");
        System.out.println("WineStockService: http://localhost:8085/WineStockService?wsdl");
        System.out.println("WineWarningService: http://localhost:8086/WineWarningService?wsdl");
    }
}