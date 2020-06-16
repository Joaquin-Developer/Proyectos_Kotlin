package Unidad4

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 5: Arrays: Ejercicio 5
 * Página del teórico: inicia en 99
 * Temas:
 *      Arrays
 *      Iteraciones con for
 * <>
 * Ejercicio 5:
    Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e informe:
    - El valor acumulado de todos los elementos.
    - El valor acumulado de los elementos que sean mayores a 36.
    - Cantidad de valores mayores a 50.
    - (Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar
    cada elemento)
 */
fun main(args:Array<String>){
    val numeros : IntArray = IntArray(8)
    for((indice, num) in numeros.withIndex()){
        // 1° For: carga de array
        println("Ingrese ${indice+1}° elemento del array:")
        numeros[indice] = readLine()!!.toInt()
    }
    var valorAcumulado : Int = 0
    var acumuladoMay36 : Int = 0
    var cantMayores50 : Int = 0
    for((indice, num) in numeros.withIndex()){
        //2° For: análisis:
        valorAcumulado += numeros[indice]
        if(numeros[indice] > 36)
            acumuladoMay36 += numeros[indice]
        if(numeros[indice] > 50)
            cantMayores50++
    }
    println("Valor acumulado de todos los elementos = $valorAcumulado")
    println("Valor acumulado de elementos mayores a 36 = $acumuladoMay36")
    println("Cantidad de valores mayores a 50 = $cantMayores50")

} // End main