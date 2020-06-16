package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 2: Funciones: Retorno de datos Ejercicio 2
 * Página del teórico: inicia en 80
 * Temas:
 *      Funcion
 *      Retorno de Datos
 * <>
 * Ejercicio 2:
    Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
    mismos.
 */
fun main(args:Array<String>){
    println("Ingrese un numero: ")
    val num1 = readLine()!!.toInt()
    println("Ingrese un numero: ")
    val num2 = readLine()!!.toInt()
    println("Ingrese un numero: ")
    val num3 = readLine()!!.toInt()
    valPromedio(num1, num2, num3)
}

private fun valPromedio(a:Int, b:Int, c:Int) : Int{
    val promedio : Int = (a+b+c)/3
    return promedio
}