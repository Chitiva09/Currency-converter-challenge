package messages;

// con esta clase organizamos los mensajes que se utilicen en el codigo.
public class Messages {

    public void welcomeMessage(){
        System.out.println("-------------------------------------");
        System.out.println("|Bienvenido al conversor de monedas |");
        System.out.println("-------------------------------------");
        System.out.println();

    }

    public void introductionMessage (){
        System.out.println("=======================================");
        System.out.println("         SELECCIONE UNA OPCIÓN:        ");
        System.out.println("=======================================");
        System.out.println();
        System.out.println("  1. USD 🇺🇸   =>  ARS 🇦🇷  (Dólar a Peso Argentino)");
        System.out.println("  2. ARS 🇦🇷   =>  USD 🇺🇸  (Peso Argentino a Dólar)");
        System.out.println("  3. USD 🇺🇸   =>  BRL 🇧🇷  (Dólar a Real Brasileño)");
        System.out.println("  4. BRL 🇧🇷   =>  USD 🇺🇸  (Real Brasileño a Dólar)");
        System.out.println("  5. USD 🇺🇸   =>  COP 🇨🇴  (Dólar a Peso Colombiano)");
        System.out.println("  6. COP 🇨🇴   =>  USD 🇺🇸  (Peso Colombiano a Dólar)");
        System.out.println("  7.  Salir");
        System.out.println("=======================================");
        System.out.print("Ingrese su elección: ");
        System.out.println();
    }
    public void goOutMessage(){
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|                                      |");
        System.out.println("|   Gracias por usar el conversor de   |");
        System.out.println("|             monedas                  |");
        System.out.println("|                                      |");
        System.out.println("|         ¡Hasta la próxima!           |");
        System.out.println("|                                      |");
        System.out.println("+--------------------------------------+");
        System.out.println();
    }
    public void amountMessage(){
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|  Ingrese el valor que desea convertir |");
        System.out.println("+--------------------------------------+");
        System.out.println();
    }

    public void numberIntroductionErrorMessage(){
        System.out.println();
        System.out.println("+--------------------------------------+");
        System.out.println("|             ⚠ ERROR ⚠                |");
        System.out.println("+--------------------------------------+");
        System.out.println("|  Entrada inválida.                   |");
        System.out.println("|                                      |");
        System.out.println("|  Debe ingresar un número válido.     |");
        System.out.println("|                                      |");
        System.out.println("|  Por favor, intente nuevamente.      |");
        System.out.println("+--------------------------------------+");
        System.out.println();
    }

    public void numberCaseIncorrectError(){
        System.out.println();
        System.out.println("========================================");
        System.out.println("   ⚠  ¡Número Incorrecto Ingresado!  ⚠");
        System.out.println("========================================");
        System.out.println("    Por favor, elija un número entre   ");
        System.out.println("    1 y 7 para continuar.              ");
        System.out.println("========================================");
        System.out.println("               ¡Gracias!               ");
        System.out.println("========================================");
        System.out.println();
    }
}
