package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 5: Ejercicio 2 de Funciónes en Kotlin
 * Página del teórico: inicia en 65
 * Temas:
 *      Función
 * <>
 * Problema 2
    Confeccionar una aplicación que solicite la carga de dos valores enteros y muestre su suma.
    Repetir la carga e impresión de la suma 5 veces.
    Mostrar una línea separadora después de cada vez que cargamos dos valores y su suma.
 */
private fun main(args:Array<String>){
    for (i in 1..5){    // repetimos cinco veces
        cargaSuma()
        separacion()
    }
}

private fun cargaSuma(){
    val num1 : Int
    val num2 : Int
    println("Ingrese un numero")
    num1 = readLine()!!.toInt()
    println("Ingrese otro numero")
    num2 = readLine()!!.toInt()
    val suma : Int = (num1 + num2)
    println("Suma = $suma")
}

private fun separacion(){
    println("********************************************")
}