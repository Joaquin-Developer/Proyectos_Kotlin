package Unidad4

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 1: Introducción a los Arrays
 * Página del teórico: inicia en 92
 * Temas:
 *      Arrays
 *      Introducción a los Arrays en Kotlin
 *      Arrays de Enteros (IntArray)
 * <>
 * Un arreglo es una estructura de datos que permite almacenar un CONJUNTO de datos del
    MISMO tipo.
    Con un único nombre se define un arreglo y por medio de un subíndice hacemos referencia
    a cada elemento del mismo (componente)
 * Ejercicio:
    Se desea guardar los sueldos de 5 operarios.
    Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento
    los 5 sueldos almacenados en memoria.
    Empleando un arreglo solo se requiere definir un único nombre y accedemos a cada
    elemento por medio del subíndice
 */
fun main(args:Array<String>){
    val sueldos : IntArray  //defino array sueldos.
    sueldos = IntArray(5)   // JAVA: int[] numeros = new int[3]
    // 25: definí el total de elementos (size) del Array sueldos
    // A continuación, voy a llenar el array...
    for (i in 0..sueldos.lastIndex){
        // llenar el IntArray
        val x = i + 1
        println("Ingrese sueldo del $x° empleado: ")
        sueldos[i] = readLine()!!.toInt()
    }
    for(i in 0..sueldos.lastIndex){
        // recorrer el IntArray y mostrar sus elementos por la consola.
        val x = i + 1
        println("$x° Sueldo del Array = "+sueldos[i])
    }
}
