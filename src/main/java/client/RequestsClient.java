package client;

import com.google.gson.Gson;
import dto.CurrencyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import model.Currency;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Data
@AllArgsConstructor
public class RequestsClient {


     //String foreignExchange;
     String fixedCurrency;

    public Currency requests(String fixedCurrency) throws IOException, InterruptedException {
        //asigno la url a una variable para mejor utilizacion en el codigo
        String url = "https://v6.exchangerate-api.com/v6/f42a6864c3b7c278260fec2f/latest/" + fixedCurrency;

        //aca se crea un nuevo cliente para empezar a hacer peticiones a la api
        HttpClient client = HttpClient.newHttpClient();

        //se inicia una nueva peticion y se envia un request a la api utilizando la url de acceso
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        //un response no se inicializa porque se recibe desde la peticion que ya se ha hecho a la api.
        //la respuesta obtenida se transforma con ayuda del bodyHandlers.ofString() en una cadena para un mejo manejo.
        //con el .send se hace la peticion a la api y se espera el response para ser guardado y tratado.
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        //la respuesta o sea el body del json obtenido en el request por medio del response se almacena en una variable llamada json
        String json = response.body();

        //este sout solo es para guia
        //System.out.println(json);

        //se crea una instancia de Gson para poder manipular el json
        Gson gson = new Gson();

        //esta asignacion de variable tipo CurrencyDto me ayuda a mandar los datos a mi clase dto y ella se conecta con mi clase
        // model para asignarselos a las propiedades de esa clase model
        Currency currency = gson.fromJson(json, Currency.class);
        System.out.println(currency);

        return currency;
    }

}
