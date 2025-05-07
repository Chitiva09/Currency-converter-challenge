# Camilo Bermeo
___ 
## Currency-converter-challenge
### Challenge conversor de monedas Oracle Alura Latam!
___
#### Descripcion
Este proyecto muestra un software funcional para la conversion de monedas, segun la opcion que elija el usuario para la 
conversion de monedas, el software le pedira que ingrese la cantidad de dinero que desea convertir, el software consumira
una api que brinda informacion sobre diferentes monedas a nivel mundial, despues de hacer esta busqueda le regresara al 
usuario el valor total de la conversion en la moneda que el usuario eligio. 

#### ¿Por que es util?

este software es muy util para cuando se desea indagar sobre la conversion de una moneda a otras especificas
___

#### Tecnologias utilizadas
+ Intellij IDEA.
+ Java 21.
+ Gson library.
+ ExchangeRate-API.
+ Postman.
___

### Como usar este proyecto

1. Clonar el repositorio:
   ``` bash
   https://github.com/Chitiva09/Currency-converter-challenge.git
2. Abrir este proyecto con el editor de codigo de su elección, en mi caso he utilizado Intellij IDEA.
3. Darle Run desde la clase Application al proyecto para empezar a utilizarlo.
4. interactuar con este software.
___
### Explicación del codigo

#### Json recibido de la API
La API que usamos para este proyecto nos da una respuesta en Json que se ve asi: 
```Json
    "result": "success",
    "base_code": "USD",
    "conversion_rates": {
        "USD": 1,
        "AED": 3.6725,
        "AFN": 71.1199,
        "ALL": 86.8437,
        "AMD": 389.5887,
        "ANG": 1.7900,
```

A continuacion les explicare partes importantes del codigo para el funcionamiento correcto del software

#### 1. Petición a la API 
Ubicado en la clase RequestsClient.java, esta clase permite utilizar el HttpResponse y el HttpRequest para hacer las
peticiones del cliente a la api.

El siguiente codigo muestra el metodo utilizado para estas peticiones del cliente y respuestas de la API, se le inyecta 
una variable la cual contiene el tipo de moneda base para hacer la consulta del valor de esa moneda "base_code"
```java  
 public Currency requests(String fixedCurrency) throws IOException, InterruptedException {}
```
El siguiente codigo muestra el HttpRequest y el HttpResponse, con el HttpRequest hacemos una peticion a la API por medio
de una url establecida para hacer la peticion correctamente gracias a la variable inyectada fixedCurrency y el HttpResponse
se encarga de recibir la informacion de la API y tratarla para convertirla en un body que despues asignaremos a nuestra clase model 
Currency y ya deja de ser un Json para convertirse en un objeto, ta,bien podemos observar que retorna la clase Currency para 
poder ser utilizado este metodo en otras clases donede lo deseemos.
```java  
       String url = "https://v6.exchangerate-api.com/v6/f42a6864c3b7c278260fec2f/latest/" + fixedCurrency;
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        
        String json = response.body();
        Gson gson = new Gson();
        Currency currency = gson.fromJson(json, Currency.class);
        return currency;
```
#### 2. Metodo conversion de moneda
```java  
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
```
Ubicado en la clase Converter.java este metodo sirve para solicitar el monto de dinero que el usuario desee covertir, envia 
como parametro a la clase RequestClient el tipo de moneda base que debera buscar en el API por medio del HttpRequest y despues
este metodo hace una validacion para que esta informacion recibida de la clase Currenci.java la cual tiene los datos del Json 
transformados en objeto no sea null y produzca error.
#####
Luego con esta linea de codigo extrae la moneda especifica a la que se le quiera hacer conversion, en este caso como podemos ver
es de Dolar(USD) a peso Argentino(ARS)
```java
change = currency.getConversionRates().get("ARS");
```
#####
Se hace la multiplicacion para la conversion de una moneda a otra y se muestra en consola por medio de un System.out.println()

#### 3. Metodo main 
Ubicado en la clase Application.java es el encargado de darle vida al software desde este metodo y esta clase se hacen las lineas de 
codigo mas importantes.

```java
    public static void main(String[] args) throws IOException, InterruptedException {
        int optionClient = 0;
        Scanner scan = new Scanner(System.in);
        Messages messages = new Messages();
        Converter converter = new Converter();
        messages.welcomeMessage();

        while (optionClient!=7) {
            messages.introductionMessage();
            while (!scan.hasNextInt()) {
                messages.numberIntroductionErrorMessage();
                scan.next(); 
            }
            optionClient = scan.nextInt();
            if ((optionClient >= 0 && optionClient <= 7)) {
                switch (optionClient) {
                    case 1:
                        converter.usdXArs();
                        break;
                   case 2: ...
                   case 3: ...
                   case 4: ...
                   case 5: ...
                   case 6: ...   
                    case 7:
                        messages.goOutMessage();
                        break;
                }
            }else {
                messages.numberCaseIncorrectError();
            }
        }
    }
```
Podemos ver que se inicializa una variable para la obtencion de la opcion que desee realizar el usuario y ademas se instancian
las otras clases de las cuales obtendremos informacion.
#####
Se coloca todo dentro de un bucle while para que este mensaje se repita a menos que la variable optionClient equivalga a 7, en el 
caso en que esta variable tenga el valor de 7 el bucle terminara su ciclo y el codigo terminara. 
#####
Despues vemos que por medio de otro bucle while haceos validación de que lo que introduzca el usuario solo sea un numero entero, 
esto para evitar errores.
#####
Despues vemos que se optiene la opcion ingresada por el usuario por medio del  scan.nextInt() y guardado en la variable optionClient
#####
Se utiliza un switch que para poder hacer uso de este primero se hacen unas validaciones por medio de un if, esto con el motivo de que
el usuario no introduzca una opcion que no este dentro de los casos del switch, en caso de que el usuario introduzca un numero fuera
del rango 1 a 7, no se entrara al switch y se dara un mensaje de error. en el caso en que todo este bien se ingresa al switch por medio de
la opcion que eligio ell usuario.
#####
Dentro del switch se tienen diferentes casos para las opciones que eligira el usuario, y dentro de cada caso se hace llamado a un metodo en la clase Converter.java,
 en esta clase se hace el rsto de la implementacion para el funcionamiento de este software.
---
## FELIZ DE SER APRENDIZ EN ALURA LATAM