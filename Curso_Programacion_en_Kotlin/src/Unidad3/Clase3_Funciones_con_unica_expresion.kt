package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 3: Funciones con única expresión
 * Página del teórico: inicia en 82
 * Temas:
 *      Funcion
 *      Funciones con única expresión
 * <>
 * Las funciones de una única expresión se pueden expresar en Kotlin sin el bloque de llaves
    y mediante una asignación indicar el valor que retorna.
    Recordemos que uno de los objetivos en Kotlin es permitirnos implementar los algoritmos en
    la forma más concisa posible.
    Resolveremos algunas de las funciones ya planteadas utilizando esta nueva sintaxis
 * Ejercicio 1:
    Confeccionar una función que le enviemos como parámetro el valor del lado de un cuadrado
    y nos retorne su superficie
 */
fun main(args:Array<String>){
    println("Ingresar el lado de un cuadrado en cm")
    val lado = readLine()!!.toDouble()
    println("La superficie es: "+ superficie(lado))
}

private fun superficie(lado : Double) = Math.pow(lado, 2.0)     // una funcion en una única línea!! Kotlin es lo mas :)