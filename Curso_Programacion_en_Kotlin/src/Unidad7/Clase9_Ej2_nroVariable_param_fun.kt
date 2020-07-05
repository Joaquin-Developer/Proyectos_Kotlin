package Unidad7
/**
 * Created by JoaquínParrilla on 05/07/2020.
 * Clase 9: Funciones: número variable de parámetros
 * Página del teórico: inicia en 227
 * Temas:
 *      Número variable de parámetros en Funcion
 *      Ejercicio 2
 * <>
todo Ejercicio 2:
    Elaborar una función que reciba como primer parámetro que tipo de operación queremos
    hacer con los siguientes datos enteros que le enviamos.
**/

enum class operacion{
    SUMA,
    PROMEDIO
}

fun operar(tipoOperacion: operacion, vararg numeros: Int): Int{
    when(tipoOperacion){
        operacion.SUMA -> return numeros.sum()
        operacion.PROMEDIO -> return numeros.average().toInt()
        // el metodo average retorna el promedio de los elementos del array
    }
}

fun recorrerArray(array: IntArray){
    println("******** Elementos del array ********")
    for(i in array.indices)
        println("Elemento [${i + 1}] = ${array[i]}")
    println("*************************************")
}

fun main(args: Array<String>) {
    var numeros: IntArray = IntArray(3)
    for(i in numeros.indices){
        println("Ingrese ${i + 1}° numero:")
        numeros[i] = readLine()!!.toInt()
    }
    recorrerArray(numeros)  // imprimo el array

    val sumaNums = operar(operacion.SUMA, * numeros)
    /**
     * Operador Spread:
     * con esto le indicamos al compilador que ya le estamos enviando
     * un array (en este caso el array numeros)
     */
    println("La suma de todos los elementos es = $sumaNums")
    val promedioNums = operar(operacion.PROMEDIO, * numeros)
    println("El promedio de todos los elementos es = $promedioNums")
}

