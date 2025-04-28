package messages;

// con esta clase organizamos los mensajes que se utilicen en el codigo.
public class Messages {

    public void introductionMessage (){
        System.out.println("Bienvenido al conversor de monedas");
        System.out.println("elija una opcion");
        System.out.println();
        System.out.println("1. Dolar =>> Peso Argentino");
        System.out.println("2. Peso Argentino =>> Dolar");
        System.out.println("3. Dolar =>> Real Brasileño");
        System.out.println("4. Real Brasileño =>> Dolar");
        System.out.println("5. Dolar =>> Peso Colombiano");
        System.out.println("6. Peso Colombiano =>> Dolar");
        System.out.println("7. Salir");
        System.out.println();
    }
    public void goOutMessage(){
        System.out.println("gracias por usar nuestro conversor de monedas");
        System.out.println();
        System.out.println("hasta la proxima");
    }
    public void amountMessage(){
        System.out.println("ingrese el valor que desa convertir");

    }
}
