package converter;

import client.RequestsClient;
import messages.Messages;

import java.io.IOException;
import java.util.Scanner;

public class Converter {
    String foreignExchange;
    double currencyPrice;
    double amount;
    double dollarPrice;

    RequestsClient requestsClient = new RequestsClient(foreignExchange, currencyPrice);
    Messages messages = new Messages();
    Scanner scan = new Scanner(System.in);




    public void usdXArs() throws IOException, InterruptedException {

        messages.amountMessage();
        amount = scan.nextDouble();
        requestsClient.requests(foreignExchange ="USD");
        dollarPrice = currencyPrice;


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
