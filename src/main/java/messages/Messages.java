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
        System.out.println("Gracias por usar nuestro conversor de monedas");
        System.out.println();
        System.out.println("Hasta la proxima");
    }
    public void amountMessage(){
        System.out.println("Ingrese el valor que desea convertir");

    }

    public void numberIntroductionErrorMessage(){
        System.out.println("Debe ingresar un numero valido. Intenta de nuevo");
        System.out.println();
    }

    public void numberCaseIncorrectError(){
        System.out.println("Usted ha ingresado un numero incorrecto");
        System.out.println();
        System.out.println("Por favor elija un numero entre 1 y 7");
        System.out.println();
        System.out.println("Gracias");
    }
}
