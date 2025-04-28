package application;


import converter.Converter;
import messages.Messages;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int optionClient;

        Scanner scan = new Scanner(System.in);
        // instancio la clase Message para poder traer los metodos que se encuentran en ella
        Messages messages = new Messages();
        //instancio la clase Converter para usar los metodos de conversion de monedas
        Converter converter = new Converter();

        //aca hago llamado al metodo que se encuentra en la clase Message
        messages.introductionMessage();
        //el cliente escoge la opcion
        optionClient= scan.nextInt();

        do {
            switch (optionClient) {
                // dolar a peso argentino
                case 1:
                    converter.usdXArs();
                    break;
                //peso argentino a dolar
                case 2:
                    converter.arsXUsd();
                    break;
                //dolar a real brasileño
                case 3:
                    converter.usdXBrl();
                    break;
                //real brasileño a dolar
                case 4:
                    converter.brlXUsd();
                    break;
                //dolar a peso colombiano
                case 5:
                    converter.usdXCop();
                    break;
                //peso colombiano a dolar
                case 6:
                    converter.copXUsd();
                    break;
                //salir
                case 7:
                    messages.goOutMessage();
                    break;
            }
        }while(optionClient==7);
    }
}