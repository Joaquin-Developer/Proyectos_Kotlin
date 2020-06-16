package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 5: Funciones con única expresión
 * Página del teórico: inicia en 84
 * Temas:
 *      Funcion
 *      Funciones con única expresión
 * <>
 * Ejercicio 3:
    Programar una función que reciba un entero comprendido entre 1 y 5 y nos retorne en
    castellano dicho número o un String con la cadena "error" si no está comprendido entre 1 y 5.
 */
fun main(args:Array<String>){
    println("Ingrese un entero entre el 1 y el 5: ")
    val num = readLine()!!.toInt()
    val devFuncion : String = numEscrito(num)
    if(devFuncion.equals("Error: El numero debe estar comprendido entre el 1 y el 5.")){
        println(devFuncion)
    }else{
        println("El numero $num se ecribe: $devFuncion")
    }
}

private fun numEscrito(num:Int) = when(num){
    1 -> "Uno"
    2 -> "Dos"
    3 -> "Tres"
    4 -> "Cuatro"
    5 -> "Cinco"
    else -> "Error: El numero debe estar comprendido entre el 1 y el 5."
}
