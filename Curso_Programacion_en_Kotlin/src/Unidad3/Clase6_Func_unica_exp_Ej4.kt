package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 6: Funciones con única expresión
 * Página del teórico: inicia en 84
 * Temas:
 *      Funcion
 *      Funciones con única expresión
 * <>
 * Ejercicio 4:
    Confeccionar una función que le enviemos como parámetro un String y nos retorne la
    cantidad de caracteres que tiene. En la función main solicitar la carga de dos nombres
    por teclado y llamar a la función dos veces. Imprimir en la main cual de las dos
    palabras tiene más caracteres.
 */
fun main(args:Array<String>){
    println("Cuenta letras xD")
    println("Ingrese la primer palabra: ")
    val palabra1 = readLine()!!.toString()
    println("Ingrese la segunda palabra: ")
    val palabra2 = readLine()!!.toString()
    if(tamanio(palabra1) > tamanio(palabra2)){
        println("La palabra con mas caracteres es $palabra1")
    } else if(tamanio(palabra2) > tamanio(palabra1)){
        println("La palabra con mas caracteres es $palabra2")
    }else {
        println("Ambas palabras tienen la cantidad de caracteres.")
    }
}

private fun tamanio(palabra:String) = palabra.length
