package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 4: Funciones con única expresión
 * Página del teórico: inicia en 83
 * Temas:
 *      Funcion
 *      Funciones con única expresión
 * <>
 * Ejercicio 2:
    Programar una función de una única expresión que le enviemos como parámetros dos enteros y nos
    retorne el mayor
 */
fun main(args:Array<String>){
    println("Ingrese primer numero:")
    val num1 = readLine()!!.toInt()
    println("Ingrese segundo numero: ")
    val num2 = readLine()!!.toInt()
    println("El mayor entre $num1 y $num2 es "+mayor(num1, num2))
}
// Teniendo en cuenta que la instrucción if puede disponerse como una expresión como lo
// vimos anteriormente está permitido su uso en las funciones con una única expresión:
private fun mayor(a:Int, b:Int) = if(a > b) a else b