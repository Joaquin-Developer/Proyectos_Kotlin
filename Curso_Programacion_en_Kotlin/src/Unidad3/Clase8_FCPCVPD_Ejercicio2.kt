package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 8: Funciones con parámetros con valor por defecto
 * Página del teórico: inicia en 87
 * Temas:
 *      Funciones con parámetros con valor por defecto
 * <>
 * Ejercicio 2:
    Confeccionar una función que reciba entre 2 y 5 enteros. La misma nos debe retornar
    la suma de dichos valores. Debe tener tres parámetros por defecto.
 */
fun main(args:Array<String>){
    //ejemplos de prueba:
    println(suma(1,1,1,1,1))
    println(suma(1,1))
}

private fun suma(a:Int, b:Int, c:Int = 1,d : Int = 1, e : Int = 1) = (a + b + c + d + e)