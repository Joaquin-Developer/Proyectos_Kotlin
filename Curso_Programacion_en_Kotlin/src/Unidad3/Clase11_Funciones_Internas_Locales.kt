package Unidad3

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 11: Funciones Internas o Locales en Kotlin
 * Página del teórico: inicia en 90
 * Temas:
 *      Funcion
 *      Funciones Internas o Locales
 * <>
 * Kotlin soporta funciones locales o internas, es decir, una función dentro de otra función
 * Ejercicio:
    Programar una función que permita ingresar 10 valores por teclado y contar cuantos son
    múltiplos de 2 y cuantos son múltiplos de 5.
 */
fun main(args:Array<String>){
    multiplos2y5()
}

private fun multiplos2y5(){

    fun multiplo(num : Int, valor : Int) = (num % valor == 0)   // funcion interna. (Retorna un boolean).

    // continuo con el flujo de la funcion multiplos2y5() ...
    var multiplos2 : Int = 0
    var multiplos5 : Int = 0
    for(i in 1..10){
        println("Ingrese el $i° numero:")
        val num = readLine()!!.toInt()
        if(multiplo(num, 2) == true)
            multiplos2++
        if(multiplo(num, 5) == true)
            multiplos5++
    }
    println("Cantidad de múltiplos del 2: $multiplos2")
    println("Cantidad de múltiplos del 5: $multiplos5")
}
/*
A una función interna solo la podemos llamar desde la misma función donde se la define, es
decir la función multiplo solo puede ser llamada dentro de la función multiplos2y5. Si desde
la función main tratamos de llamar a la función multiplo se genera un error en tiempo de
compilación.
 */