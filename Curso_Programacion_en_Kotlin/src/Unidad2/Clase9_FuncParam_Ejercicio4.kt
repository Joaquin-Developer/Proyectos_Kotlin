package Unidad2

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 9: Funciones: Parámetros Ejercicio 4
 * Página del teórico: inicia en 76
 * Temas:
 *      Funcion
 *      Parámetros
 * <>
 * Ejercicio 4:
    En la función main solicitar que se ingrese una clave dos veces por teclado.
    Desarrollar una función que reciba dos String como parametros y muestre un mensaje si
    las dos claves ingresadas son iguales o distintas.
 */
fun main(args:Array<String>){
    println("Ingrese clave: ")
    val clave1 : String = readLine()!!.toString()
    println("Repita la clave: ")
    val clave2 : String = readLine()!!.toString()
    val iguales : Boolean = valida(clave1, clave2)
    if(iguales == true)
        println("Iniciando sesión...")
    else
        println("Error: Las claves no coinciden.")

}

private fun valida(clave1 : String, clave2 : String) : Boolean{ // aquí nos metemos con algo nuevo...
    val sonIguales : Boolean
    if(clave1.equals(clave2)){
        sonIguales = true
    } else{
        sonIguales = false
    }
    return sonIguales
}


