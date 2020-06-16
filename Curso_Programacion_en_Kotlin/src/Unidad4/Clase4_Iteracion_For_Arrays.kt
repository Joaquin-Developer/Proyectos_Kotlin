package Unidad4

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 4: Iterar con un for un objeto array
 * Página del teórico: inicia en 98
 * Temas:
 *      Arrays
 *      Iterar con for un objeto array
 *      For
 * <>
 * Ejercicio 4:
todo     Cargar un arreglo de 5 elementos de tipo entero. Imprimir luego todo el arreglo

 */
fun main(args:Array<String>){
    val numeros : IntArray = IntArray(5)
    /*
todo    FORMA CLÁSICA DE CARGAR ARRAY.
    for (i in numeros.indices){     // IntRage
        println("Ingrese ${i+1} elemento: ")
        numeros[i] = readLine()!!.toInt()
    }
     */
    // TODO- A continuaciíon veremos una forma de cargar array con for iterador:
    for((indice, elemento) in numeros.withIndex()){
        println("Ingrese $indice elemento del array:")
        numeros[indice] = readLine()!!.toInt()
    }

    var cont = 0
    for(num in numeros){    //todo Iteramos array completo con el for
        println("${cont+1}° elemento: $num")
        cont++
    }
}
