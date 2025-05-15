package br.com.fiap.winery.client;

import br.com.fiap.winery.WineStockService;
import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;




public class ApplicationClient1 {

    public static void main(String[] args) throws Exception {
        URL wsdlUrl = new URL("http://localhost:8085/WineStockService?wsdl");

        // Use ESTES parâmetros exatos (verifique no WSDL)
        QName serviceName = new QName("http://winery.fiap.com.br/", "WineStockService");
        QName portName = new QName("http://winery.fiap.com.br/", "WineStockServicePort");

        Service service = Service.create(wsdlUrl, serviceName);
        WineStockService port = service.getPort(portName, WineStockService.class);

        System.out.println("=== TESTE DO SERVIÇO ===");
        System.out.println(port.getMenu());
        System.out.println(port.placeOrder("Merlot", 3));
    }
}