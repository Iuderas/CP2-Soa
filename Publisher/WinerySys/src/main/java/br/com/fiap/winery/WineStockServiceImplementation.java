// WineStockServiceImplementation.java
package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(
        serviceName = "WineStockService",
        portName = "WineStockServicePort",
        targetNamespace = "http://winery.fiap.com.br/",
        endpointInterface = "br.com.fiap.winery.WineStockService"
)
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return """
               Tipos de vinhos disponíveis:
               1. Tinto - Cabernet Sauvignon
               2. Tinto - Merlot
               3. Branco - Chardonnay
               4. Rosé - Grenache
               """;
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! " + quantity + " garrafas de " + name;
    }
}