package br.com.fiap.winery.client;

import br.com.fiap.winery.WineStockService;
import br.com.fiap.winery.WineWarningService;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws Exception {
        // Configuração do cliente WineStockService
        URL stockUrl = new URL("http://localhost:8085/WineStockService?wsdl");
        QName stockQName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service stockService = Service.create(stockUrl, stockQName);
        WineStockService wineService = stockService.getPort(WineStockService.class);

        // Configuração do cliente WineWarningService
        URL warningUrl = new URL("http://localhost:8086/WineWarningService?wsdl");
        QName warningQName = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service warningService = Service.create(warningUrl, warningQName);
        WineWarningService warning = warningService.getPort(WineWarningService.class);

        // Testes
        System.out.println("=== MENU ===");
        System.out.println(wineService.getMenu());

        System.out.println("\n=== PEDIDO ===");
        System.out.println(wineService.placeOrder("Merlot", 2));

        System.out.println("\n=== ALERTA ===");
        System.out.println(warning.sendWarn());
    }
}