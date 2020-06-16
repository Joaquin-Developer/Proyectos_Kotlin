package Unidad4
/**
 * Created by Joaquín Parrilla on 22/04/2020.
 * Clase 6: Funciones: parámetros y retorno de datos tipo arreglo
 * Página del teórico: inicia en 100
 * Temas:
 *      Arrays
 *      Funciones
 *      Parámetros y retorno en funciones
 * <>
    Hemos visto el objetivo de plantear funciones en un programa y que las mismas pueden
    recibir datos por medio de parámetros y retornar un dato.
    Los parámetros de una función pueden ser de tipo Int, Char, Float etc. como hemos visto en
    conceptos anteriores pero también pueden ser de tipo arreglo como veremos en este concepto.
 todo| Ejercicio:
    Definir en la función main un arreglo de enteros de 5 elementos. Declarar dos funciones, en
    una efectuar la carga de sus elementos y en la otra su impresión.
====================================================================================================================
todo|Parte 2 del ejercicio: Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir
    la cantidad de sueldos a ingresar. Luego crear un arreglo con dicho tamaño.
    Definir una función de carga y otra de impresión */
fun main(args:Array<String>){
    //val numeros : IntArray = IntArray(5)    //declaro nombre, tipo y tamaño de array en una sola línea.
    //cargarArray(numeros)
    //imprimirArray(numeros)
    sueldos()
}
private fun sueldos(){
    //TODO: Parte 2 Ejercicio
    val largo: Int
    println("Ingrese cantidad de sueldos a ingresar: ")
    largo = readLine()!!.toInt()
    val sueldos: IntArray = IntArray(largo)
    cargarArray(sueldos)
    imprimirArray(sueldos)
}

private fun cargarArray(array: IntArray){
    for(i in array.indices){
        println("Ingrese ${i+1}° elemento del Array: ")
        array[i] = readLine()!!.toInt()
    }
}

private fun imprimirArray(array : IntArray){
    var cont=0
    for(num in array){
        println("${cont+1}° elemento: $num")
        cont++
    }
}