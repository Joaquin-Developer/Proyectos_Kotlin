package Unidad7
/**
 * Created by JoaquínParrilla on 05/07/2020.
 * Clase 10: Valores Nulos en Kotlin
 * Página del teórico: inicia en 231
 * Temas:
 *      Valores nulos en Kotlin y su manejo
 *      Ejercicio de Aplicación
 * <>
todo TEORIA:
Hasta ahora no analizamos como Kotlin trata los valores nulos (null) en la definición de
variables. En Kotlin se trata en forma separada las variables que permiten almacenar un
valor null y aquellas que por su naturaleza no lo pueden almacenar.

Para permitir que una variable contenga un valor null, debemos agregar el caracter "?" en el
momento que definimos el tipo de la variable (con esto indicamos al compilador de Kotlin
que son variables que permiten almacenar el valor null)
 **/

private fun ejemploValoresNull(){

    val nombre: String?
    // con "?" le indicamos al compilador que la variable admite valores nulos
    nombre = null   // notar que no da error de compilación.
    /*todo solo en caso que sea una variable var, no podemos cambiar su estado null, una vez indicado */

    println("Nombre: $nombre")      // imprime: Nombre: null

    /* Mas ejemplos: */
    var telefonos: IntArray? = IntArray(10)
    telefonos = null    // aplica a todos los elementos del arreglo

    var edad: Int? = 4  // declaro e asigno el valor 4
    edad = null     // apntamos edad a null

}

fun verificarNulos(){
    var cadena1: String? = null
    var cadena2: String? = "Hola"
    if(cadena1 != null)
        println("cadena1 almacena $cadena1")
    else
        println("cadena1 es una variable nula")

    if(cadena2 != null)
        println("cadena2 almacena $cadena2")
    else
        println("cadena2 es una variable nula")

    // Podemos intentar llamar a sus métodos y propiedades sin que se genere un error cuando
    //  disponemos el operador "?" seguido a la variable:
    print("Total de letras de $cadena1")
    println(cadena1?.length)


}


fun main(args: Array<String>) {
    //ejemploValoresNull()
    verificarNulos()
}
