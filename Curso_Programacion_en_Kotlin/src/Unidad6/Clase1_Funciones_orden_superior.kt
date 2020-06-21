package Unidad6
/**
 * Created by JoaquínParrilla on 20/06/2020.
 * Clase 1: Funciones de Órden Superior en Kotlin
 * Página del teórico: inicia en 176
 * Temas:
 *      Funciones de Órden Superior
 * <>
Kotlin es un lenguaje orientado a objetos pero introduce características existentes en los
lenguajes funcionales que nos permiten crear un código más claro y expresivo.
Una de las características del paradigma de la programación funcional son las funciones de
orden superior.
Las funciones de orden superior son funciones que pueden recibir como parámetros otras
funciones y/o devolverlas como resultados.
Ejemplo 1:
Definir una función de orden superior llamada operar. Llegan como parámetro dos enteros y
una función. En el bloque de la función llamar a la función que llega como parámetro y
enviar los dos primeros parámetros.
La función retorna un entero.
 **/

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int{
    return fn(v1, v2)
}

fun suma(v1: Int, v2: Int): Int = v1 + v2
fun resta(v1: Int, v2: Int): Int = v1 - v2
fun mult(v1: Int, v2: Int): Int = v1 * v2
fun div(v1: Int, v2: Int): Int = v1 / v2

fun main(args: Array<String>) {
    var v1: Int; var v2: Int
    println("Valor de v1:")
    v1 = readLine()!!.toInt()
    println("Valor de v2:")
    v2 = readLine()!!.toInt()
    var res: Int
    res = operar(v1, v2, ::suma)    // indicamos la referencia con operador ::
    println("$v1 + $v2 = $res")
    res = operar(v1, v2, ::resta)
    println("$v1 - $v2 = $res")
    res = operar(v1, v2, ::mult)
    println("$v1 * $v2 = $res")
    res = operar(v1, v2, ::div)
    println("$v1 / $v2 = $res")
}
