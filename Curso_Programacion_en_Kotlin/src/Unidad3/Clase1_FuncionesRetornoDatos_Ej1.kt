package Unidad3

/**
 * Created by Joaquín Parrilla on 15/04/2020.
 * Clase 1: Funciones: Retorno de datos Ejercicio 1
 * Página del teórico: inicia en 77
 * Temas:
 *      Funcion
 *      Retorno de Datos
 * <>
 * Vimos que una función la definimos mediante un nombre y que puede recibir datos por
    medio de sus parámetros.
    Los parámetros son la forma para que una función reciba datos para ser procesados. Ahora
    veremos otra característica de las funciones que es la de devolver un dato a quien invocó la
    función (recordemos que una función la podemos llamar desde la función main o desde otra
    función que desarrollemos)

 * Ejercicio 1:
    Confeccionar una función que le enviemos como parámetro el valor del lado de un cuadrado
    y nos retorne su superficie. (Similar al ejercicio ya realizado)

 */
fun main(args:Array<String>){
    println("Ingrese el lado de un Cuadrado en cm :")
    val lado : Double = readLine()!!.toDouble()
    println("El área o superficie del Cuadrado es "+superficie(lado))  //podemos usar este recurso original de Java!!
}

private fun superficie(lado : Double) : Double{ // funcion que recibe un Double y devuelve otro Double
    val sup : Double = Math.pow(lado, 2.0)
    return sup
}