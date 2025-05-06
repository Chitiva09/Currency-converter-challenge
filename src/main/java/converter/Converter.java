package converter;

import client.RequestsClient;
import messages.Messages;
import model.Currency;

import java.io.IOException;
import java.util.Currency;
import java.util.Map;
import java.util.Scanner;

public class Converter {
    String fixedCurrency="";//Moneda fija
    double amount;//Monto
    String currencyName;//Nombre de la moneda
    Map<String, Double>currencyConverter;//Conversion de la moneda
    double total;
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
            total= amount*change;
            System.out.println("El valor "+ amount + " [USD] corresponde al valor final de "+ total + "[ARS]");
        }

    }

    public void arsXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("ARS");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("USD");
            total= amount*change;
            System.out.println("El valor "+ amount + " [ARS] corresponde al valor final de "+ total + "[USD]");
        }

    }
    public void usdXBrl(){
        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("USD");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("BRL");
            total= amount*change;
            System.out.println("El valor "+ amount + " [USD] corresponde al valor final de "+ total + "[BRL]");
        }
    }
    public void brlXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("BRL");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("USD");
            total= amount*change;
            System.out.println("El valor "+ amount + " [BRL] corresponde al valor final de "+ total + "[USD]");
        }
    }
    public void usdXCop(){
        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("USD");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("COP");
            total= amount*change;
            System.out.println("El valor "+ amount + " [USD] corresponde al valor final de "+ total + "[COP]");
        }
    }
    public void copXUsd(){
        messages.amountMessage();
        amount = scan.nextDouble();
        Currency currency = requestsClient.requests("COP");
        if (currency.getConversionRates()!= null) {

            change = currency.getConversionRates().get("USD");
            total= amount*change;
            System.out.println("El valor "+ amount + " [COP] corresponde al valor final de "+ total + "[USD]");
        }
    }
}
