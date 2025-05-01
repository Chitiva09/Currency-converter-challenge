package converter;

import client.RequestsClient;
import dto.CurrencyDto;
import messages.Messages;
import model.Currency;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Converter {
    String fixedCurrency="";//Moneda fija
    double amount;//Monto
    String currencyName;//Nombre de la moneda
    Map<String, Double>currencyConverter;//Conversion de la moneda
    Double change;

    RequestsClient requestsClient = new RequestsClient(fixedCurrency);
    Messages messages = new Messages();
    Scanner scan = new Scanner(System.in);
    Currency currency = new Currency(currencyName, currencyConverter);



    public void usdXArs() throws IOException, InterruptedException {

        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("USD");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("ARS");
            System.out.println(change);
        }

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
