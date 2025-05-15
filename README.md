# WinerySOAP - Web Service SOAP

## Integrantes:
- Lucas Yuji - RM99757
- Enzo Goulart - RM99666  
- Gustavo Bonfim - RM98864

## Testando o método placeOrder:

Para chamar corretamente a função `placeOrder` via SOAP, **use os parâmetros como `arg0` e `arg1`** no XML:

```xml
<fiap:placeOrder>
   <arg0>Nome do Vinho</arg0>    <!-- name -->
   <arg1>Quantidade</arg1>       <!-- quantity -->
</fiap:placeOrder>
