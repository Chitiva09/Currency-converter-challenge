package client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestsClient {


    String foreignExchange;
    double currencyPrice;

    public RequestsClient(String foreignExchange, double currencyPrice) {
        this.foreignExchange = foreignExchange;
        this.currencyPrice = currencyPrice;
    }


    public double requests(String foreignExchange) throws IOException, InterruptedException {

        String url = "https://v6.exchangerate-api.com/v6/f42a6864c3b7c278260fec2f/latest/"+ foreignExchange;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return currencyPrice;
    }




    public String getForeignExchange() {
        return foreignExchange;
    }

    public void setForeignExchange(String foreignExchange) {
        this.foreignExchange = foreignExchange;
    }
    public String getCurrencyPrice() {
        return currencyPrice;
    }

    public void setCurrencyPrice(String currencyPrice) {
        this.currencyPrice = currencyPrice;
    }
}
