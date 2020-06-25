package Unidad6
/**
 * Created by JoaquínParrilla on 25/06/2020.
 * Clase 7: Expresiones Lambda con arreglos - Ejercicio
 * Página del teórico: inicia en 196
 * Temas:
 *      Funciones
 *      Expresiones Lambda con Arrays
 *      Ejercicio
 * <>
Ejercicio propuesto:
    Crear un arreglo de tipo FloatArray de 10 elementos, cargar sus elementos por teclado.
    Imprimir la cantidad de valores ingresados menores a 50.
    Imprimir un mensaje si todos los valores son menores a 50.
 **/

fun main(args: Array<String>) {

    var array: FloatArray = FloatArray(10)
    var entrada: Float
    for(i in 0..array.lastIndex){
        println("Ingrese el ${i+1}° elemento del array:")
        entrada = readLine()!!.toFloat()
        array[i] = entrada
    }

    // cantidad de valores <= 50
    val menores50: Int = array.count { it <= 50 }

    // todos los valores son <= 50 ?:
    if(array.all { it < 50 })
        println("Todos los elementos son menores a 50")
    else
        println("Todos los elementos NO son menores a 50")








}
