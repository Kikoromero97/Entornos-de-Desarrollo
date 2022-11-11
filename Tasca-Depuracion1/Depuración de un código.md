# Depuración de un código
### Francisco Romero Gálvez

Donat el projecte IntelliJ adjunt, comproveu mitjançant depuració del sistema:

### 1. __En la función1... Què fan aquestes línies de codi?__

>       String string2 = "string2";
>
> En estas línea se le asigna a la variable string2 un String, con el contenido "string2".

>      string2= string2.substring(0, string2.length()-1);
>
> A la variable string2 se le resta una letra a la longitud de string2, por lo que se quedaría en "string".

>      string2=string2+"1";
>
>A la variable string2 se le añade un carácter, que en este caso es "1", por lo que se queda en "string1"

### 2. Què valen les variables string1 i string2 abans d'executar el codi de comprovació següent?

>        if(string1 == string2 ) {
>         System.out.println("SÓN IGUALS " + a );.
>        }
>         else {
>            System.out.println("SÓN DIFERENTS");
>        }
>
> ![](file:///C:\Users\elord\Downloads\depuracion1.png)
> string1 y string2 valen "string2".

### 3. Per què no funciona l'operador ==? Quin operador s'ha d'usar en lloc d'aquest?
> ![](file:///C:\Users\elord\OneDrive\Escritorio\depuracion2.png)
>
> Al ser String ambas variables, hay que colocar el operador .equals(string2), ya que == es para números Int. Con .equals nos dirá si string1 es igual a string2.

### 4. La función2() està declarada com segueix:
>     public void funcion2() {
>     System.out.println("--------------");
>     System.out.println("Aquesta és la funció 2");
>     System.out.println("Com faig la crida perquè funcione????");
>     }
> 

### Aquesta funció com l'he de cridar des del mètode MAIN perquè funcione. Existeixen 2 possibilitats. Explica-les.

> 
> ![](p4.png)
>
> Colocamos el static a funcion2() y colocamos funcion2() dentro del método main para que pueda llamarlo.


