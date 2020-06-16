package Unidad4

/**
 * Created by Joaquín Parrilla on 16/04/2020.
 * Clase 3: Arrays en Kotlin: Ej.3
 * Página del teórico: inicia en 96
 * Temas:
 *      Arrays
 *      IntArray
 * <>
 * Ejercicio 3:
    Cargar un arreglo de 10 elementos de tipo entero y verificar posteriormente si el mismo está
    ordenado de menor a mayor
 */
fun main(args:Array<String>){
    val enteros : IntArray
    enteros = IntArray(10)
    var estanOrdenados : Boolean = true
    for(i in 0..enteros.lastIndex){ //cargamos en IntArray...
        println("Ingrese el "+(i+1)+"° entero :")
        enteros[i] = readLine()!!.toInt()
    }
    for(i in 0..enteros.lastIndex-1){   //puedo usar enteros.size-2
        if(enteros[i+1] < enteros[i]){
            estanOrdenados = false
            break        //si ya se cumple que no estan ordenados, no es necesario seguir con el for.
        }
    }
    if(estanOrdenados)
        println("Los elementos del Array estan ordenados")
    else
        println("Los elementos del Array no estan ordenados")

}
