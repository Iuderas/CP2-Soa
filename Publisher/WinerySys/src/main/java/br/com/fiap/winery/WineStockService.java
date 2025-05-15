// WineStockService.java (Interface)
package br.com.fiap.winery;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;

@WebService(
        name = "WineStockService",
        targetNamespace = "http://winery.fiap.com.br/"
)
@SOAPBinding(style = Style.RPC)
public interface WineStockService {
    @WebMethod
    String getMenu();

    @WebMethod
    String placeOrder(String name, int quantity);
}