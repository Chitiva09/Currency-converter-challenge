package converter;

import client.RequestsClient;
import dto.CurrencyDto;
import messages.Messages;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Converter {
    String fixedCurrency="";//Moneda fija
    double amount;//Monto
    String currencyName;//Nombre de la moneda
    Map<String, Double>currencyConverter;//Conversion de la moneda
    double change;

    RequestsClient requestsClient = new RequestsClient(fixedCurrency);
    Messages messages = new Messages();
    Scanner scan = new Scanner(System.in);
    CurrencyDto currencyDto = new CurrencyDto(currencyName, currencyConverter);



    public void usdXArs() throws IOException, InterruptedException {

        messages.amountMessage();
        amount = scan.nextDouble();

        CurrencyDto dto = requestsClient.requests("USD");
        change = currencyDto.conversionRates().get("ARS");
        System.out.println(change);


    }




    public void arsXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
    }
    public void usdXBrl(){
        messages.amountMessage();
        amount = scan.nextDouble();
    }
    public void brlXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
    }
    public void usdXCop(){
        messages.amountMessage();
        amount = scan.nextDouble();
    }
    public void copXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
    }
}
